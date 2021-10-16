import edu.princeton.cs.algs4.StdOut;

public class Rational{
    private final int num;
    private final int denom;
    
    public boolean equals(Rational that){
        if(this.num == that.num && this.denom == that.denom){
            return true;
        }else
            return false;
    }

    public Rational dividedBy(Rational that){
        
        long bigGCD = gcd((long) this.num * (long) that.denom, (long) this.denom * (long) that.num);
        long bigNum = (long) this.num * (long) that.denom / bigGCD;
        long bigDenom = (long) this.denom * (long) that.num / bigGCD;
        
        if (bigNum > Integer.MAX_VALUE || bigNum < Integer.MIN_VALUE || bigDenom > Integer.MAX_VALUE){
            throw new AssertionError("overflow detected");
        }

        return new Rational((int)bigNum, (int)bigDenom); 
    }

    public Rational times(Rational that){
        long bigGCD = gcd((long) this.num * (long) that.num, (long) this.denom * (long) that.denom);
        long bigNum = (long) this.num * (long) that.num / bigGCD;
        long bigDenom = (long) this.denom * (long) that.denom / bigGCD;
        
        if (bigNum > Integer.MAX_VALUE || bigNum < Integer.MIN_VALUE || bigDenom > Integer.MAX_VALUE){
            throw new AssertionError("overflow detected");
        }

        return new Rational((int)bigNum, (int)bigDenom); 
    }

    public Rational minus(Rational that){
        long bigNumer = (long)this.num * (long)that.denom - (long)that.num  *(long)this.denom;
        long bigDenom = (long)this.denom * (long)that.denom;
        long GCD = gcd( bigNumer,bigDenom);
        bigNumer/= GCD;
        bigDenom/= GCD;
        
        StdOut.println(bigNumer + " " + bigDenom);

        if (bigNumer > Integer.MAX_VALUE || bigNumer < Integer.MIN_VALUE || bigDenom > Integer.MAX_VALUE){
            throw new AssertionError("overflow detected");
        }

        return new Rational((int)bigNumer, (int)bigDenom);
    
    }

    public Rational plus(Rational that){
        long bigNumer = (long)this.num * (long)that.denom + (long)that.num  *(long)this.denom;
        long bigDenom = (long)this.denom * (long)that.denom;
        long GCD = gcd( bigNumer,bigDenom);
        bigNumer/= GCD;
        bigDenom/=GCD;
        
        if (bigNumer > Integer.MAX_VALUE || bigNumer < Integer.MIN_VALUE || bigDenom > Integer.MAX_VALUE){
            throw new AssertionError("overflow detected");
        }

        return new Rational((int)bigNumer, (int)bigDenom);
    
    }
    public Rational(int numerator, int denominator){
        if(denominator == 0){
            throw new RuntimeException("divide by zero error");
        }
        
        int Gcd = (int)gcd(numerator, denominator);
        numerator/=Gcd;
        denominator/=Gcd;
            if (denominator < 0){
                num = -numerator ;
                denom = -denominator;
            }
            else {
                this.num = numerator;
                this.denom = denominator;
            }
    }
   
    public static long gcd(long num, long denom){
        if (denom == 0){
            return num;
        }
        long mod_ab = num % denom;
        return gcd(denom, mod_ab);
    }

    public String toString(){
        return this.num + "/" + this.denom;
    }

}