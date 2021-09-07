//demonstrates autoboxing (https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html)
//demonstrates type warnings on using 'raw types' (https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html)
//using a library feature (ArrayList<E>) that needs objects, not primitive types

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class WrapperUse {
    public static void main(String[] args) {
	readNumList();
    }

    //read a list of numbers from the console and store it in a ArrayList
    public static void readNumList() {
	Scanner sc = new Scanner(System.in);


	//works, but see details of the warning by compiling using -Xlint	
	ArrayList numlist = new ArrayList();

	//The type argument, inside the diamond, cannot be a primitive type 
	///ArrayList<double> numlist = new ArrayList<double>();


	//better to delcare numlist to be of type java.util.List,
	//but we didn't discuss interfaces yet
	//ArrayList<Double> numlist = new ArrayList<Double>(); //correct declaration


	System.out.println("Enter a list of numbers (press any of [a-z] to end):");
	while (sc.hasNextDouble()) {
	    double indbl = sc.nextDouble();
	    System.out.println("\t {I just read: " + indbl + "}");

	    //automatic boxing of double as java.lang.Double
	    numlist.add(indbl);
	}
	System.out.println("Input complete.\n\n");

	System.out.println("List of numbers read: \n" + numlist);

	// //try to add an integer to the list
	// //observe difference when using raw types vs type argument Double
	numlist.add(23.0); //fine
	numlist.add(46); //int disallowed (when using generics)
	System.out.println("List of numbers read: \n" + numlist);

	
	// //print types of all objects inside numlist
	// //verify that all elements inside numlist are of type java.lang.Double
	// System.out.println("\n\nTypes of all elements inside the list created:");
	// for (Object o: numlist) {
	//     System.out.print(o.toString() + ":");
	//     System.out.println(o.getClass().toString());
	// }

    }
}



