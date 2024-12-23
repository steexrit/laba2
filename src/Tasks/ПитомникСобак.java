package Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class ПитомникСобак {
    private List<Dog> dogs;
    // Конструктор
    public ПитомникСобак() {
        dogs = new ArrayList<>();
    }
    // Метод для добавления собаки в питомник
    public void addDog(Dog dog) {
        dogs.add(dog);
    }
    // Метод для вывода всех собак из питомника
    public void displayDogs() {
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
    public static void main(String[] args) {
        // Создание объекта ПитомникСобак
        ПитомникСобак питомник = new ПитомникСобак();
        // Добавление нескольких объектов собаки в питомник
        питомник.addDog(new Dog("Павел", 3));
        питомник.addDog(new Dog("Сергей", 5));
        питомник.addDog(new Dog("Владислав", 2));
        // Вывод всех собак
        питомник.displayDogs();
    }
}
