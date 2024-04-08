package EX10;
class Caaa{
    public int n1,n2;
    public Caaa(){
        n1=n2=1;
    }
    public Caaa(int a,int b){
        n1=a;
        n2=b;
    }
    public void show(){
        System.out.println("n1: "+n1+" n2: "+n2);
    }
}
class Cbbb extends Caaa{
    Cbbb(){
        super();
    }
    Cbbb(int a,int b){
        super(a,b);
    }
}
public class ex10 {
    public static void main(String[] args) {
        Cbbb obj1 = new Cbbb();
        Cbbb obj2 = new Cbbb(5,6);
        obj1.show();
        obj2.show();
    }
}
