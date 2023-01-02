import java.io.IOException;

class Counter implements AutoCloseable {
    int countNumber;
    boolean on;
    public Counter(){
        this.countNumber = 0;
        on = false;
    }
    public int add(int a){
        if (a<0) throw new RuntimeException("меньше 1");
        for (int i = 0; i < a; i++) {
            countNumber +=1;
        }
        return countNumber;

    }
    public int getA(){return countNumber;}

     @Override
     public void close() throws Exception {
         if (on){
             on = false;
             countNumber = 0;
         }
     }
 }

