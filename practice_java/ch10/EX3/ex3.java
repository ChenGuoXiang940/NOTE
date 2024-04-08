package EX3;
class Rectangle{
    public int length,width;
    Rectangle(){
        length=2;
        width=2;
    }
    Rectangle(int a,int b){
        length=a;
        width=b;
    }
    public void show(){
        System.out.print("Length = "+length+
        ", Width = "+width);
    
    }
}
class Data extends Rectangle{
    Data(){
        super();
    }
    Data(int a,int b){
        super(a,b);
    }
    void area(){
        show();
        System.out.println(", Area = "+(length*width));
    }
}
public class ex3 {
    public static void main(String[] args) {
        Data obj1=new Data(3,8);
        Data obj2=new Data();
        obj1.area();
        obj2.area();
    }
}
