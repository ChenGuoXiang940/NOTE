package EX9;
class Shape{
    public double area(){
        return 0.0;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double r){
        radius=r;
    }
    public double area(){
        return 3.14*radius*radius;
    }
}
class Square extends Shape{
    double side;
    Square(double s){
        side=s;
    }
    public double area(){
        return side*side;
    }
}
class Triangle extends Shape{
    double base,height;
    Triangle(double b,double h){
        base=b;
        height=h;
    }
    public double area(){
        return 0.5*base*height;
    }
}
public class ex9 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle(5.0),
            new Square(4.0),
            new Triangle(3.0, 6.0)
        };
        Shape largestShape = largest(shapes);
        System.out.println("The shape with the largest area has an area of: " + largestShape.area());
    }
    public static Shape largest(Shape[] shapes) {
        Shape largestShape = null;
        double largestArea = 0.0;
    
        for (Shape shape : shapes) {
            double area = shape.area();
            if (area > largestArea) {
                largestArea = area;
                largestShape = shape;
            }
        }
    
        return largestShape;
    }
}
