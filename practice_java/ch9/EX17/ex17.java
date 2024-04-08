package EX17;
class Circle{
    private double radius;
    Circle(double r){
        this.radius=r;
    }
    public double  getR(){
        return radius;
    }
}
public class ex17 {
    public static void main(String[] args) {
        Circle[] circles=new Circle[3];
        circles[0]=new Circle(2.0);
        circles[1]=new Circle(3.0);
        circles[2]=new Circle(4.0);
        System.out.println(average(circles));
    }
    public static double average(Circle[] c){
        double sum=0;
        for (int i = 0; i < c.length; i++) {
            sum+=c[i].getR();
        }
        return sum/c.length;
    }
}

