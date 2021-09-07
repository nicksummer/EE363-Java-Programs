//test creating an array of length 0

//TODO (in testarr2.java): array bounds checking and compare with C++

public class testarr {
    public static void main(String[] args) {
	int[] arr1 = new int[0];
	//int[] arr1 = new int[5];

	System.out.println(arr1.length);
	arr1[0] = 10;
	System.out.println(arr1);
    }
}

