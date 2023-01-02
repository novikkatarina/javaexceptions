public class FactorialException extends Exception{
    private int number;
    public int GetNumber(){
        return number;
    }
    public FactorialException (String message, int num){
        super(message);
        number = num;
    }
}