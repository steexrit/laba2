package Tasks;
public class Tester {
    private Circle[] circles;
    private int numberOfCircles;
    // Конструктор с параметрами
    public Tester(int numberOfCircles) {
        this.numberOfCircles = numberOfCircles;
        circles = new Circle[numberOfCircles];
    }
    // Метод для добавления окружности в массив
    public void addCircle(int index, Circle circle) {
        if (index >= 0 && index < numberOfCircles) {
            circles[index] = circle;
        }
    }
    // Метод для вывода всех окружностей
    public void displayCircles() {
        for (int i = 0; i < numberOfCircles; i++) {
            if (circles[i] != null) {
                System.out.println(circles[i]);
            }
        }
    }
    public static void main(String[] args) {
        // Создание объекта Tester с тремя окружностями
        Tester tester = new Tester(3);
        // Создание окружностей и добавление их в массив
        tester.addCircle(0, new Circle(new Point(0, 0), 5));
        tester.addCircle(1, new Circle(new Point(1, 1), 10));
        tester.addCircle(2, new Circle(new Point(2, 2), 15));
        // Вывод всех окружностей
        tester.displayCircles();
    }
}
