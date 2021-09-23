public class Matrix{

    private Matrix() { }

    public static double dot_product(double[] x, double[] y){
        int minimum = x.length < y.length ? x.length:y.length;

        double outp = 0;
        for(int i =0; i< minimum; i++)
            outp += x[i] * y[i];

        return outp;
    }

    public static void main(String[] args){
      

        //Matrix matrix = new matrix();
        double[] x = new double[] {1,1,1};
        double[] y = new double[] {1,2,3};
        double dot_Product = Matrix.dot_product(x, y); 
        System.out.println("The dot product of matrix x and y is " + dot_Product);
        
    }

    
}

