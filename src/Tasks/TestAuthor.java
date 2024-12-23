package Tasks;
public class TestAuthor {
    public static void main(String[] args) {
        // Создание объекта класса Author
        Author author = new Author("Матвей", "gusev.m.m@edu.mirea.ru", 'M');
        // Вывод информации об авторе
        System.out.println(author);
        // Изменение email автора
        author.setEmail("new@edu.mirea.ru");
        // Вывод обновленной информации об авторе
        System.out.println("Обновленный email: " + author.getEmail());
        System.out.println(author);
    }
}
