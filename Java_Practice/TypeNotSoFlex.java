//type checking example
//Java's type checking is stricter than C (see flextype.c)

public class TypeNotSoFlex {
    public static void main(String args[]) {
	int x = 10;  
	double y = 88.5;

	x =  y; //error
	//x = (int) y; //try coercion ...
	//x = y*2; //still no ...
	
	System.out.println("x: " + x);
	System.out.println("y: " + y);

	return;
    }
}
