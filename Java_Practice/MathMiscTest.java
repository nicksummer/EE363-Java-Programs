//functions, class variables in java.lang.Math
//https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html


import java.lang.Math; //done by default

class MathMiscTest {
    public static void main(String[] args) {

	//test functions
	System.out.println("A random number: " +  Math.random());

	//test constants
	System.out.println("pi: " +  Math.PI);
	System.out.println("e: " +  Math.E);

	//test functions again
	System.out.println("Another random number: " +  Math.random());
	System.out.println("2^5 = " +  Math.pow(2, 5) + "; 3^8 = " +  Math.pow(3, 8));


	//test hierarchy
	System.out.println("\nClass heirarchy:");
	HierarchyFinder.PrintHierarchy("MathMiscTest");
		         

	//its constructor is private
	//attempt to instantiate a Math object
	//Math mobj = new Math();
    }
}

