package EX5;
class Triangle{
    protected int base,height;
    protected void show(){
        System.out.print("Base = "+base+
        ", Height = "+height);
    }
}
class Data extends Triangle{
    Data(int a,int b){
        base=a;
        height=b;
    }
    void area(){
        show();
        System.out.println(", Area = "+(0.5*base*height));
    }
}
public class ex5 {
    public static void main(String[] args) {
        Data obj1=new Data(3,8);
        obj1.area();
    }
}
