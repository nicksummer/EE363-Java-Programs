package hw4.p2;
import java.util.Arrays;

class IntSet {
    //note: here length of elems is the capacity
    private int[] elems;
    //actual number of elments in the IntSet
    private int size;  //size >= 0

    
    private static int INIT_CAPACITY = 10;
    private static int INCR_SIZE = 20;
    
    public IntSet() {
	elems = new int[INIT_CAPACITY];
	size = 0;
    }


    //good constructor to prevent rep-exposure
    public IntSet(int[] arr) {
    	elems = new int[arr.length+INCR_SIZE];
    	size = 0;
	    
    	for (int e: arr) {
    	    if (!isIn(e)) {
    		elems[size++] = e;
    	    }
    	}
    }

    //first attempt at the 1-arg constructor
    // //BAD (exposes the rep) (see test2.java)
    // public IntSet(int[] arr) {
    // 	size = arr.length;	
    // 	elems = arr; //BAD
    // }


    public boolean isIn (int x)
    {
	for (int i = 0; i < size; i++) {
	    if (x == elems[i])
		return true;
	}
	
	
	return false;
    }


    public int size()
    {
	return size;
    }


    //bad implementation (see the spec file)
    //exposes the rep by leaking the reference to the data (see test1.java)
    // public int[] getAll() {
    // 	return elems; //BAD, exposes the rep 
    // }


    //Note: preserves the rep 
    //cf. MutableSharingArrayTest.java for Arrays.copyOf
    //https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#copyOf-int:A-int-
    //@ author villanlj (Lorenzo Villani)
    public int[] getAll() {
    	//note: use use size, not elems.length
    	return Arrays.copyOf(elems, size);
    	//return Arrays.copyOf(elems, elems.length);
    }

    public void insert(int x) {
	if (!isIn(x)) {
	    if (size == elems.length) {
		//increase capacity
		int[] elems2 = new int[elems.length+INCR_SIZE];
		int k = 0;
		for (int y: elems) {
		    elems2[k++] = y;
		}		
		elems = elems2;
	    }
	    
	    elems[size++] = x; 
	}
    }

    //a linked-list based implementation would be more efficient for this operation
    public void remove (int x) {
	if (isIn(x)) {
	    int loc = find(x);

	    for (int i = loc; i < size-1; i++) {
		elems[i] = elems[i+1];
	    }
	    size--;
	    
	}
    }


    private int find(int x) {
	for (int i = 0; i < size; i++) {
	    if (elems[i] == x)
		return i;	   
	}

	return -1;
    }


    //one possible implementation
    public int choose() {
	if (size == 0) {
	    throw new EmptyException("choose: empty set.");
	} else {
	    return elems[0];
	}
    }

    public String toString() {
	String res = "{";

	for (int i = 0; i < size; i++) {
	    res += elems[i];

	    if (i < size-1)
		res += ", ";
	}
	res += "}";

	return res;
    }

    
    
    
    public boolean checkRepInv() {
	if (elems == null)
	    return false;

	for (int i = 0; i < size; i++) {
	    for (int j = i+1; j < size; j++) {
		if (elems[i] == elems[j])
		    return false;
	    }
	}

	return true;
    }
		    
}
