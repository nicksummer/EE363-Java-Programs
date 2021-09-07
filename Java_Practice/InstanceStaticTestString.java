
//static and instance functions in java.lang.String
//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

public class InstanceStaticTestString {
    public static void main(String[] args) {
	String s = new String(); //invokes constructor

	s = "exploring the String class.";
	System.out.println(s);

	//testing String instance functions
	System.out.println(s.concat(" Sample string 1")); //prints the concat. String value

	//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#concat-java.lang.String-
	//"Strings are constant; their values cannot be changed after they are created."	    
	s = s.concat(" Sample string 2"); //changes the object that s refers to (but not the original String formerly referred to by s)
	
	System.out.println("**s is: " + s + "**");
	//System.out.println("is it empty?: " + s.isEmpty());
	//s = "";
	//System.out.println("is it empty?: " + s.isEmpty());
	//s = "Restored to a non-empty value.";
	//System.out.println(s);

	System.out.println("\n");
	System.out.println("s: " + s);
	String s2 = new String(s.substring(3,18)); //(just to show a) constructor 
	String s2prime = s.substring(3,18); //w/o constructor [better than the constructor approach]
	String s3 = s2.toUpperCase(); //convenient way of creating a String
	System.out.println("s3 = " + s3);
	System.out.println();

	

	//testing String static functions
	double x = 457.2312;
	String sd = String.valueOf(x); //static method invocation
	System.out.println("double value as a string: " + sd);

	// // //now use instance functions
	int decIndex = sd.indexOf('.'); //instance method invocation
	String fracPart = sd.substring(decIndex+1);
	System.out.println("fractional part: " + fracPart);


	// // System.out.println("\nSearching class heirarchy:");
	HierarchyFinder.PrintHierarchy("InstanceStaticTestString");
    }
}
