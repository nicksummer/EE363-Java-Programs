 //Test the class heirarchy of a user defined class (HelloWorld2)
//HierarchyFinder's public, static method invoked
//HierarchyFinder has no main

class HelloWorld2 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

	System.out.println("\nSearching class heirarchy:");
	HierarchyFinder.PrintHierarchy("HelloWorld2");
    }
}

