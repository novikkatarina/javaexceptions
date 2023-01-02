

public class Main {
    public static void main(String[] args) {

        try{
            int res = Factorial.GetFactorial(0);
            System.out.println(res);
        }
        catch (FactorialException e){
            System.out.println(e.getMessage());
            System.out.println(e.GetNumber());
        }
    }
}