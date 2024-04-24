package EX2;
abstract class MyMath{
    protected int ans;
    public void show(){
        System.out.println("ans="+ans);
    }
    public abstract void add(int x, int y);
    public abstract void sub(int x, int y);
    public abstract void mul(int x, int y);
    public abstract void div(int x, int y);
}
class Compute extends MyMath{
    public void add(int x, int y){
        ans = x + y;
    }
    public void sub(int x, int y){
        ans = x - y;
    }
    public void mul(int x, int y){
        ans = x * y;
    }
    public void div(int x, int y){
        ans = x / y;
    }
}
public class ex2 {
    public static void main(String[] args) {
        Compute cp=new Compute();
        cp.mul(3, 5);
        cp.show();
    }
}
