package DZ_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static DZ_3.metods.*;

public class SaveFile {
    private static String build(){
        String resultString = "";
        try {
            resultString = inputName();
            resultString = resultString + " " + inputDate();
            resultString = resultString + " " + inputPhone();
            resultString = resultString + " " + inputGender();
        } catch (Exception ex) {
            System.out.println(ex);
            // Парсим сообщение об ошибке, что бы оставить только её код
            Integer n = Integer.parseInt(ex.toString().substring(ex.toString().length() -1));
            System.exit(n); // сюда код ошибки
        }
        System.out.println(resultString);
        return resultString;
    }
    private static Void saveFile(){
        String result = build();
        String[] arr = result.split(" ");
        String name = arr[0].toLowerCase();
        try (FileWriter writer = new FileWriter(name, true)) {
            writer.write(result);
            writer.append('\n');
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static Void doIt(){
        saveFile();
        return null;
    }

}
