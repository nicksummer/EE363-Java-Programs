//Nicholas Summerville
//EE363 Professor Hussian
//Main client to illustrate how the various different functions in the Matrix class works
class ClientMatrix{

    public static void main(String[] args){
        //matrix-matrix multiplication 
        double[][]   matrixMat_a = new double[][] {{1,2,3}, {2,3,4}};
        double[][]   matrixMat_b = new double[][] {{1,2}, {3,4}, {5, 6}};
        Matrix.print_matrix(matrixMat_a);
        System.out.println("----------------");
        Matrix.print_matrix(matrixMat_b);
        System.out.println();
        System.out.println();
        Matrix.print_matrix(Matrix.matrix_matrix(matrixMat_a, matrixMat_b));

        //vector-matrix multiplication 
        double[][] VecMat_a = new double[][] {{1,2,3}, {4,5,6}};
        double[]   VecMat_x = new double[] {1,2,3};
        Matrix.print_vector(VecMat_x);
        Matrix.print_matrix(VecMat_a);
        System.out.println();
        System.out.println();
        Matrix.print_vector(Matrix.vector_matrix(VecMat_x, VecMat_a));
    
        // Matrix-Vector multiplication 
        double[][]  MatVec_a = new double[][] {{1,2,3}, {4,5,6}};
        double[]    MatVec_x = new double[] {1,2,3};
        Matrix.print_vector(MatVec_x);
        Matrix.print_matrix(MatVec_a);
        System.out.println();
        System.out.println();
        Matrix.print_vector(Matrix.matrix_vector(MatVec_a, MatVec_x));
        
        //transpose
        double[][] trans_a = new double[][] {{1,2,3}, {4,5,6}};
        Matrix.print(trans_a);
        double[][] t = Matrix.transpose(trans_a);
        System.out.println("The transpose of the matrix " + trans_a + ". ");
        Matrix.print(t);
    
        //dot product
        double[] dot_x = new double[] {1,1,1};
        double[] dot_y = new double[] {1,2,3};
        double dot_Product = Matrix.dot_product(dot_x, dot_y); 
        System.out.println("The dot product of matrix x and y is " + dot_Product);
    }
}
