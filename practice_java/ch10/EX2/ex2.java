package EX2;
class Caaa{
    public int n1,n2;
    Caaa(){
        n1=1;
        n2=1;
    }
    Caaa(int a,int b){
        n1=a;
        n2=b;
    }
}
class Cbbb extends Caaa{
    Cbbb(){
        super();
    }
    Cbbb(int a,int b){
        super(a,b);
    }
    public void show(){
        System.out.println("n1 = "+n1+
        " n2 = "+n2);
    }
}
public class ex2 {
    public static void main(String[] args) {
        Cbbb b1=new Cbbb();
        Cbbb b2=new Cbbb(3,9);
        b1.show();
        b2.show();
    }
}

