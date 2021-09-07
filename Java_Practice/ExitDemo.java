//demonstrate System.exit(status) with error codes
//https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#exit-int-

class ExitDemo {
    public static void main(String[] args) {
        System.out.println("Hello! I will exit now.");

	// change the status code argument  to exit() from 0 to 1
	// and  observe the difference in the result shown by the shell using echo:
	//javac ExitDemo.java; java Exit Demo; echo $?
	
	//System.exit(0);
	System.exit(1); 
    }
}

