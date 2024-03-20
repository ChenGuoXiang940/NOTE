package practice_java.ch8;
class Caaa{
    int a,b,c;
    Caaa(){}
}
public class ex1 {
    public static void main(String[] args) {
        Caaa obj=new Caaa();
        obj.a=5;
        obj.b=3;
        obj.c=obj.a*obj.b;
        System.out.println("a="+obj.a+" b="
        +obj.b+" c="+obj.c);
    }
}
