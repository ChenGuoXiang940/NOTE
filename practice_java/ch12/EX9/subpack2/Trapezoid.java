package EX9.subpack2;

public class Trapezoid {
    public int upper;
    public int base;
    public int height;
    public Trapezoid(int u,int b,int h){
        upper=u;
        base=b;
        height=h;
    }
    public void show(){
        System.out.println("volume="+(upper+base)*height/2);
    }
}
