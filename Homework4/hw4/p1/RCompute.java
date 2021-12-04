package hw4.p1.hw4.p1;

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
        double average = total / counter;
        System.out.printf("average of square roots is: %.2f %n", average);
        String textfilething = String.format("average of square roots is: %.2f %n", average);
        try {
            FileWriter FW = new FileWriter("avg10.txt", true);
            FW.append(textfilething);
            FW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}