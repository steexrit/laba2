package Tasks;
public class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        // Добавление компьютеров
        shop.addComputer(new Computer("Samsung", "S120", 1334567.99));
        shop.addComputer(new Computer("Apple", "MacBook M1", 12345678.99));
        // Отображение всех компьютеров
        shop.displayComputers();
        // Поиск компьютера
        Computer found = shop.findComputer("Samsung", "S120");
        if (found != null) {
            System.out.println("Найденный компьютер: " + found);
        } else {
            System.out.println("Компьютер не найден.");
        }
        // Удаление компьютера
        shop.removeComputer(found);
        // Отображение всех компьютеров после удаления
        shop.displayComputers();
        // Ввод компьютера с клавиатуры и добавление его в магазин
        Computer newComputer = shop.inputComputer();
        shop.addComputer(newComputer);
        // Отображение всех компьютеров после добавления нового
        shop.displayComputers();
    }
}

