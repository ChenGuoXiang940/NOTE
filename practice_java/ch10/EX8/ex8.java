package EX8;
class Caaa{
    public void display(){
        System.out.println("printed from Caaa class");
    }
}
class Cbbb extends Caaa{}
class Cccc extends Cbbb{}
public class ex8 {
    public static void main(String[] args) {
        Cbbb b1=new Cbbb();
        Cbbb b2=new Cccc();
        // Cccc c1=new Caaa();
        // Cccc c2=new Cbbb();
        b1.display();
        b2.display();
        //不能將子類別的實例指定給父類別的變數。
    }
}
