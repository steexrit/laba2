package Tasks;
public class Dog {
    private String name;
    private int age;
    // Конструктор для инициализации данных экземпляра
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Методы для получения имени и возраста собаки
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    // Методы для установки имени и возраста собаки
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // Метод для перевода возраста собаки в "человеческий" возраст
    public int getHumanAge() {
        return age * 7;
    }
    // Переопределение метода toString() для представления объекта в виде строки
    public String toString() {
        return "Dog{Имя='" + name + "', Возраст=" + age + " (" + getHumanAge() + " в переводе на человеческие года)}";
    }
}
