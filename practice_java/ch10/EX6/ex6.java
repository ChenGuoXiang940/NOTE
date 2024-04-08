package EX6;
class Circle{
    protected double radius,value;
    protected void show(){
        System.out.print("Radius = "+radius+", Value = "+value);
        System.out.println(", Area = "+(get_pi()*radius*radius));
    }
    protected double get_pi(){
        return 3.14;
    }
}
class Coin extends Circle{
    Coin(double a,int b){
        radius=a;
        value=b;
    }
    void print_pi(){
        System.out.println("pi = "+get_pi());
    }
}
public class ex6 {
    public static void main(String[] args) {
        Coin coin=new Coin(2.5, 10);
        coin.show();
        coin.print_pi();
    }
}
