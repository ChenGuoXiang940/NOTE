package EX7;
interface AdvancedMath{
    public void mod(int a,int b);
    public void fac(int a);
    public void pow(int a,int b);
}
interface MyMath{
    public void show();
    public void add(int x, int y);
    public void sub(int x, int y);
    public void mul(int x, int y);
    public void div(int x, int y);
}
class Compute implements MyMath,AdvancedMath{
    public int ans;
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
    public void mod(int a,int b){
        ans = a % b;
    }
    public void fac(int a){
        ans = 1;
        for(int i=1;i<=a;i++){
            ans *= i;
        }
    }
    public void pow(int a,int b){
        ans = 1;
        for(int i=0;i<b;i++){
            ans *= a;
        }
    }
    public void show(){
        System.out.println("ans="+ans);
    }
}
public class ex7 {
    public static void main(String[] args) {
        Compute cp=new Compute();
        cp.mul(3, 5);
        cp.show();
        cp.mod(14, 5);    
        cp.show();
        cp.fac(5);
        cp.show();
    }
}
