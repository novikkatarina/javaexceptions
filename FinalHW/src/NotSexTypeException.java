public class NotSexTypeException extends Exception {
    public NotSexTypeException(String message) {
        super("Неверный ввод, роле может содержать только f/m символ");
    }
}
