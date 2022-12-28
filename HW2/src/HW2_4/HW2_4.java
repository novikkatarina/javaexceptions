package HW2_4;

import java.util.Scanner;

public class HW2_4 {
    public static void main(String[] args) throws Exception {
        try{String str = null;
        str = CheckString();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static String CheckString() throws Exception{
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a string");
        String mystr = keyboard.nextLine();
        if (mystr == "") throw new Exception("Пустые строки вводить нельзя");
        return mystr;
    }
}