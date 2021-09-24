import package.Matrix;

class ClientMatrix{

    public static void main(String[] args){
        //matrix-matrix multiplication 
        double[][]   a = new double[][] {{1,2,3}, {2,3,4}};
        double[][]   b = new double[][] {{1,2}, {3,4}, {5, 6}};
        Matrix.print_matrix(a);
        System.out.println("----------------");
        Matrix.print_matrix(b);
        System.out.println();
        System.out.println();
        Matrix.print_matrix(Matrix.matrix_matrix(a,b));


    /*
        //vector-matrix multiplication 
        double[][] a = new double[][] {{1,2,3}, {4,5,6}};
        double[]   x = new double[] {1,2,3};
        Matrix.print_vector(x);
        Matrix.print_matrix(a);
        System.out.println();
        System.out.println();
        Matrix.print_vector(Matrix.vector_matrix(x, a));
    */

    /*
        // Matrix-Vector multiplication 
        double[][] a = new double[][] {{1,2,3}, {4,5,6}};
        double[]   x = new double[] {1,2,3};
        Matrix.print_vector(x);
        Matrix.print_matrix(a);
        System.out.println();
        System.out.println();
        Matrix.print_vector(Matrix.matrix_vector(a, x));
        */



    /*
        //transpose
        double[][] a = new double[][] {{1,2,3}, {4,5,6}};
        Matrix.print(a);
        double[][] t = Matrix.transpose(a);
        Matrix.print(t);
    */
        //dot product
     // double[] x = new double[] {1,1,1};
    // double[] y = new double[] {1,2,3};
    // double dot_Product = Matrix.dot_product(x, y); 
    // System.out.println("The dot product of matrix x and y is " + dot_Product);
    }
}
