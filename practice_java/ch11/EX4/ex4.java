package EX4;
interface  MyMath {
    public void show();
    public void add(int x, int y);
    public void sub(int x, int y);
    public void mul(int x, int y);
    public void div(int x, int y);
}
class Compute implements MyMath{
    protected int ans;
    public void show(){
        System.out.println("ans="+ans);
    }
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
public class ex4 {
    public static void main(String[] args) {
        Compute cp=new Compute();
        cp.mul(3, 5);
        cp.show();
    }
}
