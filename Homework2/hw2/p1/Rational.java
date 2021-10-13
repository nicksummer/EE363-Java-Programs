public class Rational{
    
    public static int Rational(int numerator, int denominator){
        
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
        return numerator + "/" + denominator;
    }

}