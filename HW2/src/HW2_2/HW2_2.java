package HW2_2;

public class HW2_2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray= new int[]{6, 6, 2, 9, 9, 2, 5, 6, 5};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (RuntimeException e) {
            System.out.println("Catching exception: " + e);
        }


    }
}