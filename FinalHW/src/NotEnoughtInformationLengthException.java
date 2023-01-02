public class NotEnoughtInformationLengthException extends Exception {
    public NotEnoughtInformationLengthException(String message) {
        super("Введено слишком мало данных");
    }
}
