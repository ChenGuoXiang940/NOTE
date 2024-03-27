package practice_java.ch9.EX16;
class Circle{
    private double radius;
    Circle(double r){
        this.radius=r;
    }
    public double  getR(){
        return radius;
    }
}
public class ex16 {
    public static void main(String[] args) {
        double[]c={2.0,3.0,4.0};
        Circle[] circles=new Circle[c.length];
        for(int i=0;i<c.length;i++){
            circles[i]=new Circle(c[i]);
        }
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
