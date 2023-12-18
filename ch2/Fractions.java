package ch2;
public class Fractions {
    private int numerator;		//attributes
	private int denominator;
	
	    // constructor
	    public Fractions(int n, int d)	// constructor
	{
		    numerator = n;
		    denominator = d;
	}
	
	    //TODO default constructor (no arguments)
	    public Fractions()
	{
	        numerator = 3;
	        denominator = 4;
	}

	    public int getNum()
	{
		    return numerator;
	}
	    public int getDenom()
	{
		    return denominator;
	}
	    public Fractions add(Fractions other)
	{
		    int n = this.numerator*other.denominator + this.denominator*other.numerator;
		    int d = this.denominator * other.getDenom();
		
		    Fractions result = new Fractions(n,d);
		    return result;
	}
	
	    // TODO  subtract()
	    public Fractions subtract(Fractions other)
	{
	        int n = this.numerator*other.denominator - this.denominator*other.numerator;
	        int d = this.denominator * other.getDenom();
	    
	        Fractions result = new Fractions(n,d);
	        return result;
	}
	
	    // TODO multiply()
	    public Fractions multiply(Fractions other)
	{
	        int n = this.numerator * other.numerator;
	        int d = this.denominator * other.denominator;
	    
	        Fractions result = new Fractions(n,d);
	        return result;
	}
	
	    // TODO toString() 
	    public String toString()
	{
	        return numerator + "/" + denominator;
	}


	    // TODO reciprocal()
	    public Fractions reciprocal()
	{
	        Fractions result = new Fractions(denominator, numerator);
	        return result;
	}
	
	
	    public static void main(String[] args) {
		    Fractions f1 = new Fractions(3,4);	// create an instance of fraction
		    Fractions f2 = new Fractions(4,5);	
		
		    Fractions f3 = f1.add(f2);			// add 2 fractions
		    System.out.println("3/4 + 4/5 = " + f3);	// print the answer
			
		
		    Fractions f4 = f1.subtract(f2);
		    System.out.println(f1 + " - " + f2 + " = " + f4);
		
		    // Add code to multiply f1 and f2 here
		
		    Fractions f5 = f1.multiply(f2);
		    System.out.println(f1 + " * " + f2 + " = " + f5);
		
		
		    // Add code to call reciprocal here
		    Fractions f6 = f1.reciprocal();
		    System.out.println(f6);
		
		    // create 2 new fractions and add them here.
		    Fractions f7 = new Fractions(3,4);
		    System.out.println(f7);
		    Fractions f8 = new Fractions(5,6);
		    System.out.println(f8);
            Fractions f9 = f7.add(f8);
            System.out.println(f7 + " + "+ f8 + " = " + f9);

	}

}

