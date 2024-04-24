package EX5;
interface iAaa{
    public void show();
}
class Bbbb{
    public int num=10;
    public void set(int n){
        num=n;
    }
}
class Cccc extends Bbbb implements iAaa{
    public void show(){
        System.out.println("num="+num);
    }
}
public class ex5 {
    public static void main(String[] args) {
        Cccc obj=new Cccc();
        obj.set(5);
        obj.show();
    }
}
