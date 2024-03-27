package practice_java.ch9;
class Caaa{
    private int value;
    public Caaa(){
        this(1);
    }
    public Caaa(int i){
        value=i;
    }
    void set_value(int n){
        value=n;
    }
    int get_value(){
        return value;
    }
}
public class ex3 {
    public static void main(String[] args) {
        Caaa a=new Caaa();
        System.out.println(a.get_value());
        a.set_value(10);
        System.out.println(a.get_value());
        Caaa b=new Caaa(12);
        System.out.println(b.get_value());
    }
}
