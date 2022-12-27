import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        try {
            submain();
        } catch (DifferenceException e) {
            System.out.println(e.getMessage());
        } catch (QuotientException e) {
            System.out.println("RuntimeException,");
        } catch (Exception e) {

        }

    }

    static void submain() throws DifferenceException, QuotientException {
        int[] arr1 = {9, 3, 6, 2};
        int[] arr2 = {5, 3, 5, 7, 6};
        Difference(arr1, arr2);
        Quotient(arr1, arr2);

    }

    public static void Difference(int[] array1, int[] array2) throws DifferenceException {
        if (array1.length != array2.length) throw new DifferenceException(array1, array2);
        int[] array3 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] - array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }

    public static void Quotient(int[] array1, int[] array2) throws QuotientException {
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) throw new QuotientException("");
        }
        if (array1.length != array2.length) throw new QuotientException("");
        float[] array3 = new float[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = (float)array1[i] / (float)(array2[i]);
        }
        System.out.println(Arrays.toString(array3));
    }
}