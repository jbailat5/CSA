package ch6;
public class Complex {
    private double a = 0;
    private double b = 0;


public Complex(double a1){
    this(a1, 0.0);
}
public Complex(double x, double y){
    a = x;
    b = y;
}
public double abs(){
    return(Math.sqrt(a*a + b*b));
}
public Complex add(Complex other){
    double c = this.a + other.a;
    double d = this.b + other.b;
    Complex num = new Complex(c,d);
    return num;
    
} 

public Complex multiplyComplex(){
    double a = this.a
    double b =

}
public String toString(){
    String string = this.a + " + " + this.b + "i";
    return string;
}
    public static void main(String [] args){
        Complex test1 = new Complex(1,2);
        Complex test2 = new Complex(3,-4);
        Complex test3 = new Complex(-3,4);
        Complex test4 = new Complex(0.0,4);
        Complex test5 = new Complex(-3,0.0);
        Complex test6 = new Complex(0.0,3);
        Complex test1a2 = test1.add(test2);
        Complex test3a4 = test3.add(test4);
        Complex test5a6 = test5.add(test6);
        Complex test1m2 = test1.
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
        System.out.println(test6); 
        System.out.println(test1a2);
        System.out.println(test3a4);
        System.out.println(test5a6);
        System.out.println(test3.abs());
    }
}
