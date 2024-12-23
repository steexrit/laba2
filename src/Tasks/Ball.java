package Tasks;
public class Ball {
    // Поля класса
    private double x = 0.0;
    private double y = 0.0;
    // Конструкторы
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Ball() {
        // Пустой конструктор, инициализирующий координаты (0.0, 0.0)
    }
    // Методы для получения и установки координат x
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    // Методы для получения и установки координат y
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    // Метод для установки координат x и y одновременно
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Метод для перемещения мяча
    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }
    // Переопределение метода toString() для представления объекта в виде строки
    public String toString() {
        return "Ball{x=" + x + ", y=" + y + '}';
    }
}
