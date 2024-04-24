package EX13;
interface iVolume{
    public void showData();
    public double vol();
}
abstract class Sphere implements iVolume{
    final double PI=3.14;
    protected int x;
    protected int y;
    protected double r;
    public void showData(){
        System.out.println("球心：("+x+","+y+")");
        System.out.println("半徑："+r);
        System.out.printf("球體積%.2f\n",vol());
    }
    public double vol(){
        return 4.0/3.0*PI*r*r*r;
    }
}
class Circle extends Sphere{
    public Circle(int a,int b,int c){
        x=a;
        y=b;
        r=c;
    }
}
public class ex13 {
    public static void main(String[] args) {
        Circle c1=new Circle(8,6,2);
        c1.showData();
    }
}
