/*Create a Circle class where
◦
declare a private constant double variable PI has value
of 3,141519
        ◦
declare a private variable called radius.
◦
class constructor will have an argument to set radius.
        ◦
declare a method called
computeArea () to compute area
of a circle object.
        ◦
create
3 different circle instances, with radiuses 5 , 10 ,
        15 .
        ◦
print all the areas using a foreach loop.*/




class Circle {
    private static final double PI = 3.14;
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double computeArea(){
        return PI * radius * radius;
    }
    public double getRadius(){
        return radius;
    }
}



public class Main {
    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(5),
                new Circle(10),
                new Circle (15)
        } ;

        for (Circle circle : circles){
            System.out.println("area of circle with radius" + circle.getRadius() + ": "+ circle.computeArea());

        }
    }
}