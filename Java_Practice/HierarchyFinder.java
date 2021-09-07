//finds the class hierarchy of a user defined class (note: keep files in the same directory)


class HierarchyFinder {
    //note: this class doesn't have a main; see HelloWorld2.java for an example use of PrintHierarchy
    public static void PrintHierarchy(String class_name) {
	try  {
	    Class c = Class.forName(class_name); 

	    //print hierarchy
	    System.out.print("[");
	    System.out.print(c.getName());
	    c = c.getSuperclass();
	    
	    while (c != null) {	
	    	System.out.print(", " + c.getName());
	    	c = c.getSuperclass();
	    }
	    System.out.println("]");
	    
	} catch (ClassNotFoundException e) {
	    System.err.print("Just fyi, caught exception: " + e);
	}	
	
    }
}

