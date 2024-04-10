package EX17;
class Trapezoid{
    int upper,base,height;
    Trapezoid(int u,int b,int h){
        this.upper=u;
        this.base=b;
        this.height=h;
    }
    public double area(){
        return (upper+base)*height/2;
    }
    public void show(){
        System.out.println("upper="+upper+",base="+base+
        ",height="+height);
    }
}
public class ex17 {
    public static void main(String[] args) {
        Trapezoid obj=new Trapezoid(4,9,5);    
        System.out.println(obj.area());
        obj.show();
    }
}
