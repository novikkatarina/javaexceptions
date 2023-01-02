public class NotNumberStringException extends Exception {
    public NotNumberStringException(String s) {
        super("Неверный ввод, ввод содержит не только цифры");

    }
}
