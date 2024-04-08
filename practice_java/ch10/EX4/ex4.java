package EX4;
class Caaa{
    private int num;
    Caaa(int n){
        num=n;
    }
    public int get(){
        return num;
    }
}
class Cbbb extends Caaa{
    Cbbb(int n){
        super(n);
    }
    public void show(){
        System.out.println("num = "+get());
    }
}
public class ex4 {
    public static void main(String[] args) {
        Cbbb bb=new Cbbb(2);
        bb.show();
    }
}
