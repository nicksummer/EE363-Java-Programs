    //Nicholas Summerville
    //EE363 Professor Hussian
    //Main client to illustrate how the various different functions in the Matrix class works
    class ClientMatrix{

        public static void main(String[] args){
            //matrix-matrix multiplication 

            System.out.println("------------------------------------------------------------");
            double[][]   matrixMat_a = new double[][] {{1,2,3}, {2,3,4}};
            double[][]   matrixMat_b = new double[][] {{1,2}, {3,4}, {5, 6}};

            System.out.println("The result of the matrix \n");
            Matrix.print_matrix(matrixMat_a);
            System.out.println("\n being multiplied by a nother matrix \n");
            Matrix.print_matrix(matrixMat_b);
            System.out.println("\n results in \n");

            Matrix.print_matrix(Matrix.matrix_matrix(matrixMat_a, matrixMat_b));

            System.out.println();
            System.out.println("------------------------------------------------------------");
        
            //vector-matrix multiplication 
            double[][] VecMat_a = new double[][] {{1,2,3}, {4,5,6}};
            double[]   VecMat_x = new double[] {1,2,3};

            System.out.println("The result of a vector \n");
            Matrix.print_vector(VecMat_x);
            System.out.println("\nand a matrix \n");
            Matrix.print_matrix(VecMat_a);
            System.out.println("\n\nbeing multiplied together is \n");

            Matrix.print_vector(Matrix.vector_matrix(VecMat_x, VecMat_a));
            System.out.println("------------------------------------------------------------");

            // Matrix-Vector multiplication 
            double[][]  MatVec_a = new double[][] {{1,2,3}, {4,5,6}};
            double[]    MatVec_x = new double[] {1,2,3};

           // Matrix.print_vector(MatVec_x);
           // Matrix.print_matrix(MatVec_a);

            System.out.println();

            System.out.println("The result of a matrix \n");
            Matrix.print_matrix(MatVec_a); 
            System.out.println("\nand a vector \n");
            Matrix.print_vector(MatVec_x);
            System.out.println("\nis \n");
            Matrix.print_vector(Matrix.matrix_vector(MatVec_a, MatVec_x));
            System.out.println("------------------------------------------------------------");
            
            //transpose
            double[][] trans_a = new double[][] {{1,2,3}, {4,5,6}};
            double[][] t = Matrix.transpose(trans_a);

            System.out.println("The transpose of a matrix   "); 
            Matrix.print_matrix(trans_a);
            System.out.println("\n");
            System.out.println("is equal to ");
            Matrix.print_matrix(t);

            System.out.println("\n\n------------------------------------------------------------");
        
            //dot product
            double[] dot_x = new double[] {1,1,1};
            double[] dot_y = new double[] {1,2,3};
            double dot_Product = Matrix.dot_product(dot_x, dot_y); 

            System.out.println("The dot product of vector \n");
            Matrix.print_vector(dot_x);
            System.out.println("\nand a vector \n");
            Matrix.print_vector(dot_y);
            System.out.println("\nis " + dot_Product);
            System.out.println("------------------------------------------------------------");
        }
    }
