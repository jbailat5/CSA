public class Cylinder {
    private Circle base;
    private double height;
    

    public Cylinder(double radius, double h){
        base = new Circle(radius);
        height = h;
    }

    public double vol(){
        double b = base.findAreaofCircle();
        double volume = (b*height);
        return volume;
    }
    public double sa(){
        double c = base.findCircumference();
        double b = base.findAreaofCircle();
        double surface = (2*b)+(c*height);
        return surface;

    }
        

        
}

    

    

