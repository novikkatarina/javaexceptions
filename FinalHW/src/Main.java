import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean key = false;
        while (!key) {
            try {
                String info = InputInfo();
                CheckWholeString(info);
                key = true;
                String[] elements = info.split(" ");
                String name = elements[0] + ".txt";
                WriteToFile("/Users/user/Katarina/GeekBrains/exceptions/FinalHW/src", name, info);
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void WriteToFile(String dir, String fileName, String info) throws IOException {
        File file = new File(dir, fileName);

        if (file.exists()) {
            Files.write(file.toPath(), List.of(info), StandardOpenOption.APPEND);
        } else if (file.createNewFile()) {
            Files.write(file.toPath(), List.of(info), StandardCharsets.UTF_8);
        }
    }

    public static String InputInfo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите данные через пробел в формате +Иванов Иван Иванович 20.04.1990 7489527 m(f)");
        String result = keyboard.nextLine();
        return result;
    }

    public static void CheckWholeString(String info) throws Exception {
        String[] elements = info.split(" ");
        CheckInfoLength(elements);
        for (int i = 0; i < 3; i++) {
            IsAlphabeticalFormat(elements[i]);
        }
        IsDateFormat(elements[3]);
        IsNumberFormat(elements[4]);
        IsSexFormat(elements[5]);
    }

    public static void CheckInfoLength(String[] elements) throws Exception {
        if (elements.length < 6) throw new NotEnoughtInformationLengthException("");
        if (elements.length > 6) throw new TooLongInformationLengthException("");
    }

    public static void IsAlphabeticalFormat(String line) throws Exception {
        if (!line.matches("[a-zA-Z]+")) {
            throw new NotAlphabeticalStringException("");
        }
    }

    public static void IsDateFormat(String inDate) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException e) {
            throw new NotDateStringException("");
        }
    }

    public static void IsNumberFormat(String line) throws Exception {
        if (!line.matches("[0-9]+")) {
            throw new NotNumberStringException("");
        }
    }

    public static void IsSexFormat(String line) throws Exception {
        if (!line.matches("f") & !line.matches("m")) {
            throw new NotSexTypeException("");
        }
    }
}
