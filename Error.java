package DZ_3;

public class Error {

    private String description;
    private Integer id;

    public String getDescription() {
        return description;
    }

    public Integer getId() {
        return id;
    }

    public Error(String description, Integer id) {
        this.description = description;
        this.id = id;
    }

    public static Error error1 = new Error("Вы ввели пустую строку. Код: ", 1 );
    public static Error error2 = new Error("Ошибка ввода. Код: ", 2 );
    public static Error error3 = new Error("Ошибка ввода: Строка не может начинаться и заканчиватся пробелом. Код: ", 3 );
    public static Error error4 = new Error("Ошибка ввода. Количество символов не соответствует шаблону. Код: ", 4 );
    public static Error error5 = new Error("Ошибка формата ввода. Код: ", 5 );
    public static Error error6 = new Error("Ошибка: Введены не цифры. Код: ", 6 );
    public static Error error7 = new Error("Ошибка ввода. Только два пола: m или f!. Код: ", 7 );
}