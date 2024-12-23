package Tasks;
public class Author {
    // Поля класса
    private String name;
    private String email;
    private char gender;

    // Конструктор
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    // Метод для получения имени автора
    public String getName() {
        return name;
    }
    // Метод для получения email автора
    public String getEmail() {
        return email;
    }
    // Метод для установки нового email автора
    public void setEmail(String email) {
        this.email = email;
    }
    // Метод для получения пола автора
    public char getGender() {
        return gender;
    }
    // Переопределение метода toString() для представления объекта в виде строки
    public String toString() {
        return "Author{Имя='" + name + "', email='" + email + "', Гендер=" + gender + '}';
    }
}
