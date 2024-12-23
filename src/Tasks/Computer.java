package Tasks;
public class Computer {
    private String brand;
    private String model;
    private double price;
    // Конструктор
    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    // Геттеры
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    // Переопределение метода toString() для представления объекта в виде строки
    public String toString() {
        return "Компьютер{бренд='" + brand + "', модель='" + model + "', цена=" + price + "}";
    }
}
