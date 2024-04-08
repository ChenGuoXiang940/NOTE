package EX1;
class Caaa{
    public int n1,n2;
}
class Cbbb extends Caaa{
    public void set_num(int a,int b){
        n1 = a;
        n2 = b;
    }
    public void show(){
        System.out.println("n1 = "+n1+
        " n2 = "+n2);
    }
}
public class ex1 {
    public static void main(String[] args) {
        Cbbb obj = new Cbbb();
        obj.set_num(5, 10);
        obj.show();
    }
}
