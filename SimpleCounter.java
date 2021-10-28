// A simple demonstration of race conditions



public class SimpleCounter implements Runnable {

    private int n; 
    private int count = 0; 


    /** return the count 
     @return count of how many times incr has been called (supposedly) */

    public int getCount() { return count; }


    public void reset() { 
	count = 0;
    }


    public void incr() { 
	    count++; 
    } 


    public SimpleCounter(int n) {
	this.n = n;
    }
    
    public void run () {
	for (int i=0; i<this.n; i++) 
	    incr();	    
	
    }
}

 
