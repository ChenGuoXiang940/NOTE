package EX11;
interface Show_ans{
    public void show();
}
interface MyMath extends Show_ans{
    public void add(int a,int b);
    public void sub(int a,int b);
    public void mul(int a,int b);
    public void div(int a,int b);
}
class Compute implements MyMath{
    public double ans;
    public void add(int a,int b){
        ans=a+b;
    }
    public void sub(int a,int b){
        ans=a-b;
    }
    public void mul(int a,int b){
        ans=a*b;
    }
    public void div(int a,int b){
        ans=a/b;
    }
    public void show(){
        System.out.println("ans="+ans);
    }
}
public class ex11 {
    public static void main(String[] args) {
        Compute cp=new Compute();
        cp.mul(3, 5);
        cp.show();
    }
}
