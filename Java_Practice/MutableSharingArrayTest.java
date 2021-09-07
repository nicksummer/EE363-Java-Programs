//demonstrate mutability 
//demonstrate shared array objects 

import java.util.Arrays;

public class MutableSharingArrayTest {
    public static void main(String[] args) {
	System.out.println("Testing mutability and sharing in arrays:\n");
	int[] arr = {10, 0, -100, 50, 1, 1, 2000, 74};
	int[] secarr;

	//secarr and arr refer to the same object
	secarr = arr;

	System.out.println("Initial state of arr and secarr:");
	System.out.println("arr: " + Arrays.toString(arr));
	System.out.println("secarr: " + Arrays.toString(secarr));
	System.out.println("(just) arr: " + arr.hashCode());
	System.out.println("secarr == arr? ... " + (secarr == arr) + "\n");
	

	//System.out.println("\n");
	arr[2] = 200;

	// //the only negative value was changed to 200
	// //this shows that arr is mutable
	// //note also that the change was reflected in secarr, as it refers to the same object as arr

	System.out.println("\nState of arr and secarr after assinging 200 to arr[2]:");
	System.out.println("arr: " + Arrays.toString(arr));
	System.out.println("secarr: " + Arrays.toString(secarr));
	System.out.println("secarr == arr? ... " + (secarr == arr) + "\n");



	int[] thirdarr = {0, 0, -1, 1, 0};        		

	//secarr will now refer to the object pointed to by thirdarr
	secarr = thirdarr;
	
	System.out.println("\nState after 'secarr = thirdarr': ");
	System.out.println("arr: " + Arrays.toString(arr));
	System.out.println("secarr: " + Arrays.toString(secarr));
	System.out.println("thirdarr: " + Arrays.toString(thirdarr));	
	System.out.println("secarr == arr? ... " + (secarr == arr));
	System.out.println("secarr == thirdarr? ... " + (secarr == thirdarr));



	// //creating a new object
	int[] copyOfarr = Arrays.copyOf(arr, arr.length);	
	System.out.println("\n\narr: " + Arrays.toString(arr));
	System.out.println("copyOfarr: " + Arrays.toString(copyOfarr));

	System.out.println("secarr: " + Arrays.toString(secarr));
	System.out.println("thirdarr: " + Arrays.toString(thirdarr));	

	System.out.println("copyOfarr == arr? ... " + (copyOfarr == arr));
	System.out.println("secarr == arr? ... " + (secarr == arr));
	System.out.println("secarr == thirdarr? ... " + (secarr == thirdarr));	
    }

}
