package EX12;
class Fraction{
    private int num,den;
    Fraction(int n,int d){
        num=n;
        den=d;
    }
    public int getN(){
        return num;
    }
    public int getD(){
        return den;
    }
}
public class ex12 {
    public static void main(String[] args) {
        Fraction f=new Fraction(5,3);
        show(f);
    }
    public static void show(Fraction f) {
        if (f.getN() == 0 || f.getD() == 0) {
            System.out.println("0");
            return;
        }
        System.out.println(f.getN() + "/" + f.getD());
    }
}
