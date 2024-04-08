package EX11;
class Fraction{
    private int num,den;
    Fraction(int n,int d){
        num=n;
        den=d;
    }
    public void setN(int n){
        num=n;
    }
    public void setD(int d){
        den=d;
    }
    public void setND(int n,int d){
        num=n;
        den=d;
    }
    public void show(){
        if(num==0||den==0){
            System.out.println("0");
            return;
        }
        System.out.println(num+"/"+den);
    }
}
public class ex11 {
    public static void main(String[] args) {
        Fraction f=new Fraction(5,3);
        f.show();
        f.setN(7);
        f.setD(12);
        f.show();
        f.setND(100,120);
        f.show();
    }
}
