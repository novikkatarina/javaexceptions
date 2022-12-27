import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean stop = false;

        while (!stop){
            try {
                CheckString();
                stop = true;
            } catch (NumberFormatException e) {
                System.out.println("try again");
            }
        }
        System.out.println("конец");
    }
    public static void CheckString(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        String mystr = keyboard.nextLine();
        Integer.parseInt(mystr);
    }
}