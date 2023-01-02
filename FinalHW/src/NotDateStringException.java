public class NotDateStringException extends Exception {
    public NotDateStringException(String message) {
        super("Веден некорректный тип данных для даты рождения, требуется формат dd.mm.yyyy");
    }
}
