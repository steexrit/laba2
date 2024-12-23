package Tasks;
public class TestBall {
    public static void main(String[] args) {
        // Создание объекта класса Ball с начальными координатами
        Ball ball1 = new Ball(1.0, 2.0);
        System.out.println(ball1);
        // Перемещение мяча
        ball1.move(3.0, 4.0);
        System.out.println("После перемещения: " + ball1);
        // Изменение координат мяча
        ball1.setX(5.0);
        ball1.setY(6.0);
        System.out.println("После изменения координат: " + ball1);
        // Установка координат x и y одновременно
        ball1.setXY(7.0, 8.0);
        System.out.println("После установки координат x и y: " + ball1);
        // Проверка работы пустого конструктора
        Ball ball2 = new Ball();
        System.out.println("Новый мяч с пустым конструктором: " + ball2);
    }
}
