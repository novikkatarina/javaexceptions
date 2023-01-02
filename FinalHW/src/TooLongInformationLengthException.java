public class TooLongInformationLengthException extends Exception {
    public TooLongInformationLengthException(String message) {
        super("Введено слишком много данных");
    }
}
