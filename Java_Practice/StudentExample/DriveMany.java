//summarized the use of various classes discussed in the lectures

import java.lang.Math;

public class DriveMany {
    public static void main(String[] args) {

	//use user-define class Student
	Student  ss = new Student("Novak L.");
	System.out.println(ss);

	Student s2 = new Student("Jack B.");
	System.out.println(s2);
	System.out.println("total #students: " + Student.getNumStudents());

	// //use Java API class java.lang.Math
	double pival = Math.PI;
	System.out.println("\npi = " +  pival);
	System.out.println("log (base 10) of one million = " + Math.log10(1000000)); 

	// //Math can't be instantiated
	// //Math mobj = new Math();


	System.out.println();
	//instantiate java.lang.String
	String x = "   able was I ere I saw elba";	
	System.out.println("Remove whitespace from String and convert to lowercase: " + x.trim().toLowerCase());    

	
	// //show a static method in java.lang.String
	// //also show use of another instance method in java.lang.String
	System.out.println();
	double z = 3209.89;
	String sofz = String.valueOf(z);
	System.out.println("Converted to string: " + sofz);
	System.out.println("Integer part of the original number: " + sofz.substring(0, sofz.indexOf('.')));
    }
}

