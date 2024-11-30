package shapes;

public class Main {
    public static void main(String[] args){
        Shape2D circle = new Circle(2);
        Shape2D rectangle =  new Rectangle(5,5);
        Shape2D[] arrayShape2D = new Shape2D[]{circle, rectangle};
        for (Shape2D shape: arrayShape2D){
            System.out.println(shape);
        }

        Shape3D cylinder = new Cylinder(7,5);
        Shape3D[] arrayShape3D = new Shape3D[]{cylinder};
        for (Shape3D shape1: arrayShape3D){
            System.out.println(shape1);
        }

    }
}
