package practice_java.ch8;
class Circle{
    double pi=3.14;
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    void show_periphery(){
        System.out.println("periphery="+2*pi*radius);
    }
}
public class ex6 {
    public static void main(String[] args) {
        Circle c1=new Circle(3.0);
        c1.show_periphery();
    }
}
