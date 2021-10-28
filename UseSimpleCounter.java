public class UseSimpleCounter {
    public static void main(String [] args) {

	if (args.length != 1) {
	    System.err.println("Usage: java SimpleCounter n \n" +
			       "  n: number of times to increment per thread\n");
	    System.exit(1);
	}

	int n = Integer.parseInt(args[0]);

	SimpleCounter mtc = new SimpleCounter(n);


	//both threads use the same counter
	Thread t1 = new Thread(mtc);
	Thread t2 = new Thread(mtc);

	System.out.println("In main: About to start threads");
	t1.start();
	t2.start();
	System.out.println("In main: just started threads... waiting for t1 to finish.");

	try {
	    t1.join();
	    System.out.println("In main: t1 finished... waiting for t2 to finish.");
	    t2.join();
	    System.out.println("In main: t2 is finished");
	} catch (InterruptedException ie) {
	    System.out.println(ie);
	    ie.printStackTrace();
	}
	//System.out.printf("count=%d\n", mtc.getCount());
    System.out.println(mtc.getCount());
    }
}
