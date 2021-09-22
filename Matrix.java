public class Matrix{
    public static void main(String[] args){
        Matrix matrix = new Matrix();
        double[] dot_x = new double[] {1,1,1};
        double[] dot_y = new double[] {1,2,3};
        double dot_Product = new matrix.dot_product(dot_x, dot_y); 
        System.out.println("The dot product of matrix x and y is " + dot_Product);
        
    }

    public double dot_product(double[]x, double[] y){
        int minimum = x.length > y.length ? x.length:y.length;
        double out = 0;
        for(int i =0; i< minimum; i++)
            out += x[i] * y[i];

        return 1;
    }
   

}

