package EX10;
class Circle{
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}
public class ex10 {
    int compare(Circle c1, Circle c2) {
        double area1 = c1.getArea();
        double area2 = c2.getArea();
        if (area1 > area2)
            return 1;
        else if (area1 < area2)
            return -1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(3.0);
        ex10 obj = new ex10();
        int result = obj.compare(c1, c2);
        if (result == 1)
            System.out.println("Circle 1 has a larger area.");
        else if (result == -1)
            System.out.println("Circle 2 has a larger area.");
        else
            System.out.println("Both circles have the same area.");
    }
}
