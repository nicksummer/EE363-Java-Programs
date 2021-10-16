public class Rationals{
    
    private final int numerator;
    private final int denominator;

   
    public static int Rational(int numerator, int denominator){

        int gcd = gcd(numerator, denominator);
        
        if(denominator == 0)
            throw new IllegalArguementException("The denominator cannot be zero");

            int gcd = gcd(numerator, denominator);

            if (numerator <= 0){
                this.numerator = -numerator/gcd;
                this.denominator = -denominator/gcd;
            }
            else {
                this.numerator = numerator;
                this.denominator = denominator;
            }
    }

    public static int gcd(int a, int b){
        if (b == 0) return a;
        int r = a % b;
        return gcd(a, r)
    }

    public Rational(int numerator, int denominator){
        this(5,4);
    }
    public String toString(){
        if(denominator == 1)
            return numerator;
        else if (numerator == 0)
            return 0;
        else
        return numerator + "/" + denominator;
    }

}