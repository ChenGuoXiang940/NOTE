package EX14;
class Shape{}
class Circle extends Shape{}
class Triangle extends Shape{}
class Coin extends Circle{}
public class ex14 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Triangle t1=new Triangle();
        Coin n1=new Coin();
        System.out.println("c1 是 Coin 的實例: " + (c1 instanceof Coin));
        System.out.println("t1 是 Shape 的實例: " + (t1 instanceof Shape));
        System.out.println("n1 是 Object 的實例: " + (n1 instanceof Object));
    }
}
