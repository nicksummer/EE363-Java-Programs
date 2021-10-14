public class Rational{
    private final numerator;
    private final denominator;
    public static Rational Rational(int numerator, int denominator){

        int gcd = gcd(numerator, denominator)
        
        if(denominator == 0)
            throw new IllegalArguementException("The denominator cannot be zero");
        
            if (numerator == 0){
                this.numerator = 0;
                this.denominator = 1;
            }
            else {
                this.numerator = numerator;
                this.denominator = denominator;
            }
    }

    public String toString(){
        if(denominator == 1)
            return numerator;
        else if (numerator == 0)
            return 0;
        else
        return numer + "/" + denominator;
    }

}