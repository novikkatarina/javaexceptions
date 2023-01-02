
class Factorial{
    public static int GetFactorial(int num) throws FactorialException{
        int result = 1;
        if (num < 0) throw new FactorialException("Число меньше нуля", num);
        for (int i = 0; i < num; i++) {
            result*=i;
        }
        return result;
    }
}