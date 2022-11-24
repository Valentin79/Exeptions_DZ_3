package DZ_3;

import java.util.Locale;
import java.util.Scanner;

public class metods {
    private static String inputString() {
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
        return  str;
    }

    public static String inputName() throws Exception {
        System.out.println("Введите через пробел фамилию, имя и отчество");
        String name = inputString();
        if (name == "") { // пустая строка
            throw new Exception(Error.error1.getDescription() + Error.error1.getId());
        }
        String[] arr = name.split(""); // преобразуем строку в массив
        int n = 0;
        for (String s : arr) {
            if (s.equals(" ")) {  // считаем пробелы
                n++;
            }
        }
        if(n != 2){
            throw new Exception(Error.error2.getDescription() + Error.error2.getId());
        }
        if(arr[0].equals(" ") || arr[arr.length -1].equals(" ")){
            // строка не может начинаться и заканчиватся пробелом
            throw new Exception(Error.error3.getDescription() + Error.error3.getId());
        }
        return name;
    }
    public static String inputDate() throws Exception {
        System.out.println("Введите дату рождения в формате дд.мм.гггг");
        String date = inputString();
        if (date == "") {
            throw new Exception(Error.error1.getDescription() + Error.error1.getId());
        }
        if(date.length() != 10){
            throw new Exception(Error.error4.getDescription() + Error.error4.getId());
        }
        String[] arr = date.split(""); // преобразуем строку в массив
        if (!arr[2].equals(".") || !arr[5].equals(".")){
            // точки должны быть на своих местах
            throw new Exception(Error.error5.getDescription() + Error.error5.getId());
        }
        int n = 0;
        String date2 = "";
        for (String s : arr) {
            if (s.equals(".")) {  // считаем точки
                n++;
            }
            else {
                date2 = date2 + s; // исключаем точки, что бы дальше проверить на цифры
            }
        }
        if (n != 2) {
            throw new Exception(Error.error2.getDescription() + Error.error2.getId());
        }
        for(char s : date2.toCharArray()){
            if(!Character.isDigit(s)){
                throw new Exception(Error.error6.getDescription() + Error.error6.getId());
            }
        }
        return date;
    }

    public static String inputPhone() throws Exception {
        System.out.println("Введите номер телефона");
        String phone = inputString();
        if (phone == "") { // пустая строка
            throw new Exception(Error.error1.getDescription() + Error.error1.getId());
        }
        for(char s : phone.toCharArray()){
            if(!Character.isDigit(s)){
                throw new Exception(Error.error6.getDescription() + Error.error6.getId());
            }
        }
        return phone;
    }

    public static String inputGender() throws Exception{
        System.out.println("Ваш пол: m / f?");
        String gender = inputString().toLowerCase();
        if (gender == "") { // пустая строка
            throw new Exception(Error.error1.getDescription() + Error.error1.getId());
        }
        if(!gender.equals("m") && !gender.equals("f")) {
            throw new Exception (Error.error7.getDescription() + Error.error7.getId());
        }
        return gender;
    }

}
