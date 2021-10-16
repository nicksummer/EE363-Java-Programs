import edu.princeton.cs.algs4.StdOut;

public class Rational{
    
    private Rational() { }

    private int num;
    private int denom;
    
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

    // public Rational minus(Rational that){
    //     int GCDNum = gcd(this.num, that.num);
    //     int GCDDenom = gcd(this.denom, that.denom);

    //     Rational addition = new Rational(((this.num / GCDNum) * (that.denom / GCDDenom)) - ((that.num / GCDNum) * (this.denom / GCDDenom)), this.denom * (that.denom / GCDDenom));
        

    //     return addition;
    // }

    public Rational plus(Rational that){
        long bigNumer = (long)this.num * (long)that.denom + (long)that.num  *(long)this.denom;
        long bigDenom = (long)this.denom * (long)that.denom;
        long GCD = gcd( bigNumer,bigDenom);
        bigNumer/= GCD;
        bigDenom/=GCD;
        StdOut.println(bigNumer + " " + bigDenom);
        
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
            if (numerator < 0){
                num = -num;
                denom = -denom;
            }
            else {
                this.num = numerator/Gcd;
                this.denom = denominator/Gcd;
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

    public static void main(String[] args){

		Rational r1 = new Rational(5, 6);
		Rational r2 = new Rational(3, 4);
		StdOut.println("r1: " + r1);
		StdOut.println("r2: " + r2);

		Rational rsum = r1.plus(r2);
		StdOut.println("r1 + r2: " + rsum);
		
		// Rational rdiff = r1.minus(r2);
		// StdOut.println("r1 - r2: " + rdiff);
		
		Rational rprod = r1.times(r2);
		StdOut.println("r1 * r2: " + rprod);
		
		// Rational rquot = r1.dividedBy(r2);
		// StdOut.println("r1 / r2: " + rquot);


		// System.out.println();

		// StdOut.println("[Rational cr1 = r1;]");
		// Rational cr1 = r1;
		// StdOut.println("cr1: " + cr1);
		

		// Rational n5 = new Rational(7, 8);
		// StdOut.println("[Rational n5 = new Rational(7, 8);]");
		// StdOut.println("r1: " + r1);
		// StdOut.println("n5: " + n5);		
		// StdOut.println("r1 equals cr1: " + r1.equals(cr1));
		// StdOut.println("r1 equals n5: " + r1.equals(n5));
		// System.out.println();

		// //another equals test (test contents, not just references)		
		// Rational cr2 = new Rational(5, 6);
		// StdOut.println("[Rational cr2 = new Rational(5, 6);]");
		// StdOut.println("r1: " + r1);
		// StdOut.println("cr2: " + cr2);		
		// StdOut.println("r1 equals cr2: " + r1.equals(cr2));
		// System.out.println();
				


		// Rational r2plusn5 = r2.plus(n5);
		// Rational res_r2plusn5 = new Rational(15, 8);
		// StdOut.println("r2 + n5: "+ r2plusn5); 
		// StdOut.println("res_r2plusn5: " + r2plusn5);
		
		//use VM flag '-ea' to cause overflow exception
		StdOut.println("\nOverflow test:");
		StdOut.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
		Rational r3 = new Rational(Integer.MAX_VALUE, 3);
		Rational r4 = new Rational(Integer.MAX_VALUE,1);
		StdOut.println("r3: " + r3);
		StdOut.println("r4: " + r4);
		StdOut.println("Will attempt r3+r4 ...");
		Rational ofl = r3.plus(r4);
		StdOut.println("r3+r4 = " + ofl);
    }

}