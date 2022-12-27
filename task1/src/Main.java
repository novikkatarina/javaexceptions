import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {6, 1, 3, 5, 7, 9};
        try{
            Scanner keyboard = new Scanner(System.in);
            System.out.println("enter a number");
            int numberEntered = keyboard.nextInt();
            int index = ArrayChecking(array, numberEntered);
            System.out.println("index is "+ index);
        }
        catch(Exception e){
            if (e.getMessage()=="-1") System.out.println("Длина массива меньше минимума");
            if (e.getMessage()=="-2") System.out.println("Элемент не найден");
            if (e.getMessage()=="-3") System.out.println("Не задан массив");
            if (e.getMessage()=="-4") System.out.println("Введенное число меньше 0");

        }
        System.out.println();
    }

    public static int ArrayChecking (int[] array, int checkNum)throws Exception{
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == checkNum) index = i;
        }
        if (array.length < checkNum) throw new Exception("-1");
        if (index == -1) throw new Exception("-2");
        if(array == null) throw new Exception("-3");
        if (checkNum<0) throw new Exception("-4");
        return index;
    }

}