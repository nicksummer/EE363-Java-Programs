public class Rational{
    
    private long num;
    private long denom;

   
    public Rational(long numerator, long denominator){

        long Gcd = gcd(numerator, denominator);
        // if (denominator == 0){
        //     throw new ArethmeticExcetption("denominator is zero");
        // }
            if (numerator < 0){
                num = -num;
                denom = -denom;
            }
            else {
                this.num = numerator = numerator/Gcd;
                this.denom = denominator/Gcd;
            }
    }

    public static long gcd(long a, long b){
        if (b == 0) return a;
        long r = a % b;
        return gcd(a, r);
    }

    public String toString(){
       // if(denom == 1)
          //  return num;
        return this.num + "/" + this.denom;
    }

    public static void main(String[] args){
        Rational test = new Rational(5,4);
        System.out.println("\n" + test);
    }

}