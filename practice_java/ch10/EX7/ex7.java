package EX7;
class Caaa{
    public void display(){
        System.out.println("printed from Caaa class");
    }
}
class Cbbb extends Caaa{
    public void display(){
        System.out.println("printed from Cbbb class");
    }
}
public class ex7 {
    public static void main(String[] args) {
        Cbbb bb=new Cbbb();
        bb.display(); 
    }
}
