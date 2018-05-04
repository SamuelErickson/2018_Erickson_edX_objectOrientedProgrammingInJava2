// Started 2018 0317 by Samuel Erickson
// Module 2 project for DEV277x Object Oriented Programming in Java


//Below is the state
public class Fraction {
    //Below is the state of the class
    private int numerator;
    private int denominator;

    // Below is the constructor of the class
    public Fraction(int numerator, int denominator){
        if (denominator==0){
            throw new IllegalArgumentException("denominator cannot be zero");
        } else if (denominator<0){
            denominator = denominator*-1;
            numerator = numerator*-1;
        }
        this.numerator = numerator;
        this.denominator = denominator;

    }

    //another constructor in case only one argument given
    public Fraction(int numerator){
        this(numerator,1);
    }

    // this is a zero argument constructor
    public Fraction(){
        this(0,1);
    }

    // below is the behavior section
    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public String toString(){
        return this.numerator+"/"+this.denominator;
    }

    public double toDouble(){
        return ((double)this.numerator)/this.denominator;
    }

    public Fraction add(Fraction other){
        // a/b + c/d = e/f
        int a = this.numerator;
        int b = this.denominator;
        int c = other.numerator;
        int d = other.denominator;
        Fraction newFrac = new Fraction();
        int e;
        int f;
        if (b==d){
            e = a+c;
            f = b;
        } else {
            e = a*d+c*b;
            f = b*d;
        }
        newFrac.numerator = e;
        newFrac.denominator = f;
        return new Fraction(e,f);
    }

    public Fraction subtract(Fraction other){
        // a/b - c/d = e/f
        int a = this.numerator;
        int b = this.denominator;
        int c = other.numerator;
        int d = other.denominator;
        Fraction newFrac = new Fraction();
        int e;
        int f;
        if (b==d){
            e = a-c;
            f = b;
        } else {
            e = a*d-c*b;
            f = b*d;
        }
        newFrac.numerator = e;
        newFrac.denominator = f;
        return new Fraction(e,f);
    }

    public Fraction multiply(Fraction other){
        int newNum = this.numerator*other.numerator;
        int newDen = this.denominator*other.denominator;
        return new Fraction(newNum,newDen);
    }

    public Fraction divide(Fraction other){
        int newNum = this.numerator*other.denominator;
        int newDen = this.denominator*other.numerator;
        return new Fraction(newNum,newDen);
    }

    public boolean equals(Object other){
        boolean isEqual = false;
        if (other.getClass().equals(this.getClass())){
            Fraction otherFrac = (Fraction)other;
            this.toLowestTerms();
            otherFrac.toLowestTerms();
            int a = this.numerator;
            int b = this.denominator;
            int c = otherFrac.numerator;
            int d = otherFrac.denominator;
            if(a==c&&b==d) {
                isEqual=true;
            }
        }
        return isEqual;
    }


    public Fraction toLowestTerms(){
        int a = this.numerator;
        int b = this.denominator;
       // System.out.println("Testing to LowestTerms()"); // keep testing here
       // System.out.println("a: "+a+" b: "+b);

        int greatestCD = gcd(a,b);
        int c = a/greatestCD;
        int d = b/greatestCD;

        return new Fraction(c,d);
    }

    private static int gcd ( int a, int b){
        //testing idea
       // System.out.println("Running gcd()"); // keep testing here
        while (a != 0 && b != 0) {
           // System.out.println("a= " + a + "b=" + b); // keep testing here
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }







}







