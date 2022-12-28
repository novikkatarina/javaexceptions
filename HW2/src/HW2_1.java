import java.util.Scanner;

public class HW2_1 {
    public static void main(String[] args) {
        boolean stop = false;
        float number = 0;

        while (!stop){
            try {
                number = CheckString();
                stop = true;
            } catch (NumberFormatException e) {
                System.out.println("try again");
            }
        }
        System.out.println("number is " + number);
    }
    public static float CheckString(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        String mystr = keyboard.nextLine();
        float number = Float.parseFloat(mystr);
        return number;
    }
}