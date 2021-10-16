public class Rational{
    
    private final long num;
    private final long denom;

   
    public int Rational(long numerator, long denominator){

        long Gcd = gcd(numerator, denominator);
        if (denominator == 0){
            throw new ArethmeticExcetption("denominator is zero");
        }
            if (numerator < 0){
                numerator = -numerator;
                denominator = -denominator;
            }
            else {
                num = numerator = numerator/Gcd;
                denom = denominator/Gcd;
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
        System.out.println("\n" + test);
    }

}