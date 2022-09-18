//Design a class named Circle containing following attributes and behavior.
// • One double data field named radius. The default value is 1.
// • A no-argument constructor that creates a default circle.
// • A Single argument constructor that creates a Circle with the specified radius.
// • A method named getArea() that returns area of the Circle.
// • A method named getPerimeter() that returns perimeter of it.
package  Pra2;
public class Circle{
    double radius;
    public Circle() //Constructor
    {
        radius=1;
    }
    public Circle(double radius){
        this.radius=radius;
        System.out.println("Radius is : "+radius);
    }
    public double getArea(double r){    //getter method to get and set the value for area
        double area=(3.14)*r*r;
        return area;
    }
    public double getPerimeter(double r){    //getter method to get and set the value for perimeter
        double perimeter = 2*(3.14)*r*r;
        return perimeter;
    }

}
