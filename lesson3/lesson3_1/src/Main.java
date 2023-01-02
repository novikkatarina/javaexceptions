public class Main {
    public static void main(String[] args) {
        int number = 0;
        try(Counter c = new Counter()){
            number = c.add(4);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println(number);
        }
    }
}