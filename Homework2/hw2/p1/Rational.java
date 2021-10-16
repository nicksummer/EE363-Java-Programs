import edu.princeton.cs.algs4.StdOut;

public class Rational{
    
    private long num;
    private long denom;

    public Rational plus(Rational that){
        long gcd1 = gcd(this.num, that.denom);
        long gcd2 = gcd(this.denom, that.num);

        Rational addition = new Rational((this.num / gcd1) * (that.num / gcd2) + (that.num / gcd1) * (this.denom / gcd2), this.denom * (that.denom / gcd2));

        addition.num *= gcd1;
        return addition;
    }

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
                this.num = numerator = numerator;///Gcd;
                this.denom = denominator;///Gcd;
            }
    }

    public static long gcd(long a, long b){
        if (b == 0) return a;
        long mod_ab = a % b;
        return gcd(a, mod_ab);
    }

    public String toString(){
       if(denom == 1){ 
            return num + "";
       }else if(num == denom){ 
           return "1";
       }else 
            return this.num + "/" + this.denom;
    }

    public static void main(String[] args){
       
		Rational r1 = new Rational(5, 6);
		Rational r2 = new Rational(3, 4);
		StdOut.println("r1: " + r1);
		StdOut.println("r2: " + r2);

		Rational rsum = r1.plus(r2);
		StdOut.println("r1 + r2: " + rsum);
		
		//Rational rdiff = r1.minus(r2);
		//StdOut.println("r1 - r2: " + rdiff);
		
		//Rational rprod = r1.times(r2);
		//StdOut.println("r1 * r2: " + rprod);
		
		//Rational rquot = r1.divides(r2);
		//StdOut.println("r1 / r2: " + rquot);


		//System.out.println();

		//StdOut.println("[Rational cr1 = r1;]");
		//Rational cr1 = r1;
		//StdOut.println("cr1: " + cr1);
		

		//Rational n5 = new Rational(7, 8);
		//StdOut.println("[Rational n5 = new Rational(7, 8);]");
		//StdOut.println("r1: " + r1);
		//StdOut.println("n5: " + n5);		
		//StdOut.println("r1 equals cr1: " + r1.equals(cr1));
		//StdOut.println("r1 equals n5: " + r1.equals(n5));
		//System.out.println();

		//another equals test (test contents, not just references)		
		//Rational cr2 = new Rational(5, 6);
		//StdOut.println("[Rational cr2 = new Rational(5, 6);]");
		//StdOut.println("r1: " + r1);
		//StdOut.println("cr2: " + cr2);		
		//StdOut.println("r1 equals cr2: " + r1.equals(cr2));
		//System.out.println();
				


		//Rational r2plusn5 = r2.plus(n5);
		//Rational res_r2plusn5 = new Rational(15, 8);
		//StdOut.println("r2 + n5: "+ r2plusn5); 
		//StdOut.println("res_r2plusn5: " + r2plusn5);
		
		//use VM flag '-ea' to cause overflow exception
		//StdOut.println("\nOverflow test:");
		//StdOut.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
		//Rational r3 = new Rational(Integer.MAX_VALUE, 3);
		//Rational r4 = new Rational(10,1);
		//StdOut.println("r3: " + r3);
		//StdOut.println("r4: " + r4);
		//StdOut.println("Will attempt r3*r4 ...");
		//Rational ofl = r3.times(r4);
		//StdOut.println("r3*r4 = " + ofl);
    }

}