package EX18;
class Hello{
    String name;
    public void say_hi(){
        System.out.println("Hi,everyone");
    }
    public void say_hi(String Str){
        System.out.println("Hi,"+Str);
        this.name=Str;
    }
}
public class ex18 {
    public static void main(String[] args) {
        Hello obj=new Hello();
        obj.say_hi();
        obj.say_hi("Tim");
    }
}
