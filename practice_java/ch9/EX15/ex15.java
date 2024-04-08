package EX15;
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
    void larger(Fraction f){
        if(this.getN()/this.getD()>f.getN()/f.getD()){
            System.out.println("f1 is larger");
        }else{
            System.out.println("f2 is larger");
        }
    }
}
public class ex15 {
    public static void main(String[] args) {
        Fraction f1=new Fraction(2, 3);
        Fraction f2=new Fraction(1, 2);
        f1.larger(f2);
    }
}
