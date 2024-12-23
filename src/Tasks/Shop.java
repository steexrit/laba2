package Tasks;
import java.util.ArrayList;
import java.util.List;
public class Shop implements shopinterface {
    private List<Computer> computers;
    // Конструктор
    public Shop() {
        computers = new ArrayList<>();
    }
    // Метод для добавления компьютера в магазин
    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер добавлен: " + computer);
    }
    // Метод для удаления компьютера из магазина
    public void removeComputer(Computer computer) {
        if (computers.remove(computer)) {
            System.out.println("Компьютер удален: " + computer);
        } else {
            System.out.println("Компьютер не найден: " + computer);
        }
    }
    // Метод для поиска компьютера по бренду и модели
    public Computer findComputer(String brand, String model) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand) && computer.getModel().equalsIgnoreCase(model)) {
                return computer;
            }
        }
        return null;
    }
    // Метод для ввода данных компьютера с клавиатуры
    public Computer inputComputer() {
        System.out.println("Введите бренд компьютера:");
        String brand = shopinterface.readString();
        System.out.println("Введите модель компьютера:");
        String model = shopinterface.readString();
        System.out.println("Введите цену компьютера:");
        double price = shopinterface.readDouble();
        return new Computer(brand, model, price);
    }
    // Метод для отображения всех компьютеров в магазине
    public void displayComputers() {
        if (computers.isEmpty()) {
            System.out.println("В магазине нет компьютеров.");
        } else {
            System.out.println("Компьютеры в магазине:");
            for (Computer computer : computers) {
                System.out.println(computer);
            }
        }
    }
}
