package practice_java.ch9.EX14;
class Fraction{
    private double num,den;
    Fraction(int n,int d){
        num=n;
        den=d;
    }
    public double getN(){
        return num;
    }
    public double getD(){
        return den;
    }
    public static Fraction compare(Fraction f1,Fraction f2){
        if(f1.getN()/f1.getD()>f2.getN()/f2.getD()){
            return f1;
        }
        return f2;
    }
    public void show(){
        if (num == 0 || den == 0) {
            System.out.println("0");
            return;
        }
        System.out.println((int)num + "/" + (int)den);
    
    }
}
public class ex14 {
    public static void main(String[] args) {
        Fraction f1=new Fraction(2,3);
        Fraction f2=new Fraction(1,2);
        Fraction f3=Fraction.compare(f1, f2);
        f3.show();
    }
}
