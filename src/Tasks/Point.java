package Tasks;
public class Point {
    private double x;
    private double y;
    // Конструктор с параметрами
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Методы для получения координат x и y
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    // Методы для установки координат x и y
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    // Метод toString для вывода информации о точке
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
