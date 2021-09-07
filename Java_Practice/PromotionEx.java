//demonstrate type promotion in Java (compare with: TypeNotSoFlex.java)

public class PromotionEx {
    public static void main(String args[]) {
	int x = 10;  
	double y = 88.0;

	//x = y; //loss (disalllowed)x
	y = x*2; //promotion to a wider type
	
	System.out.println("x: " + x);
	System.out.println("y: " + y);

	return;
    }
}
