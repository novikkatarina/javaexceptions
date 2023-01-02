
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        //        input.forEach(System.out::println);
        Map<String, String> names = new HashMap<String, String>();
//        System.out.println(new File("").getAbsolutePath());
        try (FileReader wr = new FileReader
                ("/Users/user/Katarina/GeekBrains/exceptions/lesson2/lesson2/src/test.txt")) {
//            int c;
//            while ((c=wr.read()) != -1){
//                System.out.print ((char)c);
            List<String> input = Files.readAllLines
                    (Path.of
                            ("/Users/user/Katarina/GeekBrains/exceptions/lesson2/lesson2/src/test.txt"));
            for (String s : input) {
                String[] line = s.split("=");
                names.put(line[0], line[1]);
            }
            names.forEach((key, value) -> System.out.println("[key]: "+ key + "[value]    "+value));

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
