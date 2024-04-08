package EX8;
class CCalculator{
    int a,b;
    void set_val(int a,int b){
        this.a=a;
        this.b=b;
    }
    void show(){
        System.out.println("a="+a+"b="+b);
    }
    int add(){
        return a+b;
    }
    int sub(){
        return Math.abs(a-b);
    }
    int mul(){
        return a*b;
    }
    double avg(){
        return ((double)(a+b))/2;
    }
}
public class ex8 {
    public static void main(String[] args) {
        CCalculator obj=new CCalculator();
        obj.set_val(5, 12);
        obj.show();
        System.out.println(obj.add()+" "+obj.sub()+
        " "+obj.mul()+" "+obj.avg());
    }
}
