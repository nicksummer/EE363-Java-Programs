package hw4.p1;

import jdk.nashorn.api.scripting.ScriptUtils;

import java.io.FileWriter;
import java.io.IOException;

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
        //thread.currentthread.getname()
        double average = total / counter; // %.2f %n
        System.out.printf("[Thread " + Thread.currentThread().getName() + "]" + " Average of square roots (" + left + " to " + right + ") = %.2f %n", average);
        String textfilething = String.format("[Thread " + Thread.currentThread().getName() + "]" + " Average of square roots (" + left + " to " + right + ") = %.2f %n", average);
        try {
            FileWriter FW = new FileWriter("avg10.txt", true);
            FW.append(textfilething);
            FW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}