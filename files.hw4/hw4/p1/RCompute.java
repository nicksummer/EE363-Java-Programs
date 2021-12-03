package hw4.p1;
public class RCompute implements Runnable {
    double average = 0;

    public RCompute(int left, int right) {
        double total = 0;
        int counter = 0;
        for (int i = left; i < right; i++) {
            if (i == left) {
                counter = counter + 1;
                total = sqrt(total + i);
            } else {
                counter = counter + 1 ;
                total = sqrt(total + (i + 1));
            }
        }
        average = total / counter;
    }

    public void run() {
    }
}