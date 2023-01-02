public class NotAlphabeticalStringException extends Exception {
    public NotAlphabeticalStringException(String message) {
        super("ФИО введены не буквами");
    }
}
