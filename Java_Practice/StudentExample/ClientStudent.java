//A client for the Student class, i.e from the perspective of the user (aka 'driver' class)


public class ClientStudent {
    public static void main(String[] args) {
	Student s1 = new Student("Alex S.");
	Student s2 = new Student("Liu B.");

	System.out.println(s1);
	System.out.println(s2);

	System.out.println("Total number of students: " + Student.getNumStudents());

	double[] s2grades = {10, 20, 13.5, 15};
	s2.updateCourseGrades(s2grades);


	//TODO change name, ID
	//s1.setName("Alexa S.");
	//s1.sID = 100; //data is private


	double[] joseGrades = {10, 5, 8.6, 9.3};
	Student s3 = new Student("Jose Z.", joseGrades);

	Student.numStudents = 100;
	
	Student t4 = new Student("Hartono X.");
	double[] hartonoGrades = {50};
	t4.updateCourseGrades(hartonoGrades);


	//list grades for some students
	System.out.println("\nGrades for a few students:");
	System.out.println(s1.listGrades());
	System.out.println(s3.listGrades());
	System.out.println(t4.listGrades());
	
	System.out.println("\nFinal summary:");
	System.out.println("Total number of students: " + Student.getNumStudents());
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(t4);
	
    }
}

