package EX1;
abstract class Caaa{
    protected int num;
    public abstract void show();
    public Caaa(int n){
        this.num = n;
    }
}
class Cbbb extends Caaa{
    public Cbbb(int n){
        super(n);
    }
    public void show(){
        System.out.println("num="+this.num);
    }
}
public class ex1 {
    public static void main(String[] args) {
        Cbbb bb=new Cbbb(2);
        bb.show();
    }
}