public class Matrix{

    private Matrix() { }

    public static double[][] transpose(double[][]x ){
        double[][] transpose = new double[][] { };
            
            for(int i = 0; i < x.length; i++)
                for(int j = 0; j < x[1].length; j++)
                    transpose[i][j] = x[i][j];
                    //System.out.println(x[i][j]);

            return transpose;

    }
    public void print(double[][]a){
        for(int i = 0; i < x.length; i++)
            for(int j = 0; j < x[1].length; j++)
                System.out.printf("%4f ",a[i][j]);
    }

    public static double dot_product(double[] x, double[] y){
        int minimum = x.length < y.length ? x.length:y.length;

        double outp = 0;
        for(int i =0; i< minimum; i++)
            outp += x[i] * y[i];

        return outp;
    }

    public static void main(String[] args){
        //transpose
        double[][] a = new double[][] {{1,2,3}, {4,5,6}};
        Matrix.print(a);
        //dot product
       // double[] x = new double[] {1,1,1};
       // double[] y = new double[] {1,2,3};
       // double dot_Product = Matrix.dot_product(x, y); 
       // System.out.println("The dot product of matrix x and y is " + dot_Product);
        
    }

    
}

