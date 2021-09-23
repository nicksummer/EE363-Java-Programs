public class Matrix{

    private Matrix() { }

    public static double[] matrix_vector(double[][]a, double[]b){
        double[] matvex = new double[a.length];

        for(int i = 0; i < a.length; i++)
             matvex[i] = Matrix.dot_product(a[i], b);

        return matvex;

    } //ask what to do if the matrix doesn't allow dimesions i.e what if the dimensons dont allow for multioply

    public static double[][] transpose(double[][]x ){
        double[][] transpose = new double[x[1].length][x.length];
            
            for(int i = 0; i < x.length; i++)
                for(int j = 0; j < x[1].length; j++)
                    transpose[j][i] = x[i][j];
                    //System.out.println(x[i][j]);

            return transpose;

    }
    public static void print_vector(double[]a){
            for(int j = 0; j < a.length; j++)
                System.out.printf("%4f ", a[j]);
        
            System.out.println("");
        }
        
    
    public static void print_matrix(double[][]a){
        for(int i = 0; i < a.length; i++){
            System.out.println();
            for(int j = 0; j < a[1].length; j++)
                System.out.printf("%4f ",a[i][j]);
        }
    }

    public static double dot_product(double[] x, double[] y){
        int minimum = x.length < y.length ? x.length:y.length;

        double outp = 0;
        for(int i =0; i< minimum; i++)
            outp += x[i] * y[i];

        return outp;
    }

    public static void main(String[] args){

        // Matrix-Vector multiplication 
        double[][] a = new double[][] {{1,2,3}, {4,5,6}};
        double[]   x = new double[] {1,1,1};
        Matrix.print_vector(x);
        Matrix.print_matrix(a);




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

