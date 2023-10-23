public class Circle {
    private double radius;

    public Circle (double r){
        radius = r;
        

    }
    
    public double findAreaofCircle(){
        double area = (Math.PI*(radius*radius));
        return area;

    }
    public double findCircumference(){
        double circumference = (2*Math.PI*radius);
        return circumference;
    }

}


