package Tasks;
public class Circle {
    private Point center;
    private double radius;
    // Конструктор с параметрами
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    // Методы для получения центра и радиуса
    public Point getCenter() {
        return center;
    }
    public double getRadius() {
        return radius;
    }
    // Методы для установки центра и радиуса
    public void setCenter(Point center) {
        this.center = center;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Метод toString для вывода информации об окружности
    public String toString() {
        return "Circle{" + "центр=" + center + ", радиус=" + radius + '}';
    }
}
