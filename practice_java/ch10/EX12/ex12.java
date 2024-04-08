package EX12;
class Rectangle{
    public int width,height;
    Rectangle(int w,int h){
        width=w;
        height=h;
    }
    public void show(){
        System.out.println("Width: "+width+" Height: "+height);
    }
}
class Data extends Rectangle{
    Data(int w,int h){
        super(w,h);
    }
}
public class ex12 {
    public static void main(String[] args) {
        Data obj =new Data(10, 5);
        obj.show();
    }
}
