package practice_java.ch8;
class CBox{
    int length,width,height;
}
public class ex4 {
    public static void main(String[] args) {
        CBox box=new CBox();
        box.length=15;
        box.width=10;
        box.height=25;
        System.out.println("length= "+box.length);
        System.out.println("width="+box.width);
        System.out.println("height="+box.height);
    }
}
