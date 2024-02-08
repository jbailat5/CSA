package ch6;
public class Complex {
    private double a;
    private double b;


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
public String toString(){
    String string = (this.a + " + " + this.b + "i");
    return string;
}
    public static void main(String [] args){
        Complex test1 = new Complex(1,2);
        Complex test2 = new Complex(3,4);
        System.out.println(test1);
        System.out.println(test2);
        Complex test3 = test1.add(test2);
        System.out.println(test3);
        System.out.println(test2.abs());
    }
}
