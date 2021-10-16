public class Rational{
    
    private final int numerator;
    private final int denominator;

   
    public int Rational(int numerator, int denominator){

        int gcd = gcd(numerator, denominator);
        
        if(denominator == 0)
            throw new IllegalArguementException("The denominator cannot be zero");

            int Gcd = gcd(numerator, denominator);

            if (numerator <= 0){
                this.numerator = -numerator/Gcd;
                this.denominator = -denominator/Gcd;
            }
            else {
                this.numerator = numerator/Gcd;
                this.denominator = denominator/Gcd;
            }
    }

    public static int gcd(int a, int b){
        if (b == 0) return a;
        int r = a % b;
        return gcd(a, r);
    }

    public String toString(){
        if(denominator == 1)
            return numerator;
        else if (numerator == 0)
            return 0;
        else
        return numerator + "/" + denominator;
    }

    public static void main(String[] args){
        Rational test = new Rational(5,4);
        Rational.toString(test);
    }

}