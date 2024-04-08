package EX13;
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
    public Fraction add(Fraction f){
        int n=num*f.getD()+den*f.getN();
        int d=den*f.getD();
        return new Fraction(n,d);
    }
    public void show(){
        if (num == 0 || den == 0) {
            System.out.println("0");
            return;
        }
        System.out.println(num + "/" + den);
    
    }
}
public class ex13 {
    public static void main(String[] args) {
        Fraction f1=new Fraction(3, 5);
        Fraction f2=new Fraction(1, 4);
        Fraction result=f1.add(f2);
        result.show();
    }    
}
