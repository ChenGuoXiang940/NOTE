package EX16;
class Caaa{
    int a,b,sum;
    Caaa(int a,int b){
        this.a=a;
        this.b=b;
        this.sum=a+b;
    }
    public void show(){
        System.out.println("a="+a+",b="+b+",sum="+sum);
    }
}
public class ex16 {
    public static void main(String[] args) {
        Caaa obj=new Caaa(5,8);
        obj.show();
    }
}
