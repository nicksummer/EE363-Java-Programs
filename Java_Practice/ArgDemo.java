//prints all command line arguments
//also shows the for-each loop (https://docs.oracle.com/javase/8/docs/technotes/guides/language/foreach.html)


class ArgDemo {
    public static void main(String[] args) {
	for (String a: args)
	    System.out.println("an argument: "  + a);
    }
}

//Try these:
// java ArgDemo first 30 10
// java ArgDemo
// java ArgDemo "first 30 10"



//Further reading:
//command line arguments: https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html
