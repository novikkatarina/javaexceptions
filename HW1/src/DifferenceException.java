public class DifferenceException extends Exception {
    public DifferenceException(int[] a, int[] b) {
        super(String.format("длина массивов не равны %d %d", a.length, b.length));
    }
}
