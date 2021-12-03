package hw4.p1;
public class RCompute implements Runnable {
 
    private int left;
    private int right;
    public RCompute(int left, int right) {
       this.left = left;
       this.right = right;
    }

    public void run() {
        double total = 0;
        int counter = 0;
        for (int i = left; i <= right; i++) {
          
            
          counter = counter + 1 ;
          total += Math.sqrt(i);
        
        }
        average = total / counter;
        System.out.printf("average of square roots is: %.2f %n", average);
    }
}