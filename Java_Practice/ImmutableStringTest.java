//demonstrate mutability and immutability
//demonstrate shared objects
//discuss Object.equals(); Object.hashCode()

//Note: Read section 2.3 of the textbook (ISBN: 0201657686)

import java.util.Arrays;

public class ImmutableStringTest {
    public static void main(String[] args) {
	System.out.println("Demonstrate immutability and sharing using String objects.\n");


	System.out.println("Testing String objects with String.concat:");
	String s1 = "a simple string. ";
	String cs1 = s1;
	String s2 = "(enhancement)";

	System.out.println("\nInitial state of s1, cs1, and s2:");
	System.out.println("s1: " + s1);
	System.out.println("cs1: " + cs1);
	//System.out.println("s1 hc: " + s1.hashCode());
	//System.out.println("cs1 hc: " + cs1.hashCode());
	System.out.println("s2: " + s2);
	System.out.println("s1 == cs1? ..." + (s1==cs1));

	// //https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-
	// System.out.println("s1.equals(cs1)? ..." + (s1.equals(cs1)));
	System.out.println("do and print s1.concat(s2): " + s1.concat(s2));
	// //s1 was not modified by the concatenation operation
	System.out.println("\nPost concatenation state of s1, cs1, and s2:");
	 System.out.println("s1: " + s1);
	System.out.println("cs1: " + cs1);
	System.out.println("s2: " + s2);		
	System.out.println("s1 == cs1? ..." + (s1==cs1));
	 System.out.println("s1.equals(cs1)? ..." + (s1.equals(cs1)));
	


	System.out.println("\n\nTesting String objects with operator '+':");
	String t1 = "Don't mind if I do. ";
	String ct1 = t1;
	String t2 = "Hurricane!";
	
	System.out.println("\nInitial state of t1, ct1, and t2:");
	System.out.println("t1: " + t1);
	System.out.println("ct1: " + ct1);
	System.out.println("t2: " + t2);		
	System.out.println("t1 == ct1? ..." + (t1==ct1));
	System.out.println("t1.equals(ct1)? ..." + (t1.equals(ct1)));		
	System.out.print("Performing t1 += t2 ..");
	t1 += t2;
	System.out.println(". done"); 

	// // // //t1 now points to a new string value
	// // // //note that ct1 points to the original object that t1 was also pointing to before
	// // // //this means that the original object did not change;
	// // // //a new object was created, and t1 is now referencing this new object
	System.out.println("\nPost concatenation state of t1, ct1,  and t2:");
	System.out.println("t1: " + t1);
	System.out.println("ct1: " + ct1);
	System.out.println("t2: " + t2);
	System.out.println("t1 == ct1? ..." + (t1==ct1));
	System.out.println("t1.equals(ct1)? ..." + (t1.equals(ct1)));		
    }

}

