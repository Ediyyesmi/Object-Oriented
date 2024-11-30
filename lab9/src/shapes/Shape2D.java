package shapes;

public abstract class Shape2D {
    public static final double PI = 3.14;
    protected double height;
    protected double width;
    protected double radius;

    public Shape2D(double height, double width){
        this.height=height;
        this.width=width;
    }

    public Shape2D(double radius){
        this.radius=radius;
    }

    public abstract double getArea();

    @Override
    public abstract  String toString();
}
