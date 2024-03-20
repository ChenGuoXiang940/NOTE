package practice_java.ch8;
class Cbbb{
    double x,y;
    Cbbb(double x,double y){
        this.x=x;
        this.y=y;
    }
}
public class ex2{
    public static void main(String[] args){
        Cbbb obj1=new Cbbb(5.2,3.9);
        Cbbb obj2=new Cbbb(6.5,4.6);
        Cbbb avg=new Cbbb(0,0);
        avg.x=(obj1.x+obj2.x)/2;
        avg.y=(obj1.y+obj2.y)/2;
        System.out.println("obj1.x="+obj1.x+" obj1.y="+obj1.y);
        System.out.println("obj2.x="+obj2.x+" obj1.y="+obj2.y);
        System.out.println("avg.x="+avg.x+" avg.y="+avg.y);
    }
}
