package shapes;

public class Cylinder extends Shape3D{
    public Cylinder(double height, double radius){
        super(height, radius);
    }

    public double getVolume(){
        return PI * radius * radius * height;
    }

    public double getArea(){
        return 2 * PI * radius * (radius + height);
    }

    @Override
    public String toString(){
        return "Cylinder Height = " + height + ", Radius = " + radius +
                ", Volume = " + getVolume() + ", Area = " + getArea() ;
    }
}
