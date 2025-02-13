package shapes;

public class Rectangle extends Shape2D{
    public Rectangle(double height, double width){
        super(height, width);
    }

    @Override
    public double getArea(){
        return height * width;
    }

    @Override
    public String toString(){
        return "rectangle with height: "+height+ ", width: "+width+", area: "+getArea();
    }
}
