public class Rational{
    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator){
        this(5,4);
    }
    // public Rational(int numerator, int denominator){

    //     int gcd = gcd(numerator, denominator)
        
    //     if(denominator == 0)
    //         throw new IllegalArguementException("The denominator cannot be zero");
        
    //         if (numerator == 0){
    //             this.numerator = -numerator/gcd;
    //             this.denominator = -denominator/gcd;
    //         }
    //         else {
    //             this.numerator = numerator;
    //             this.denominator = denominator;
    //         }
    // }

    public String toString(){
        if(denominator == 1)
            return numerator;
        else if (numerator == 0)
            return 0;
        else
        return numerator + "/" + denominator;
    }

}