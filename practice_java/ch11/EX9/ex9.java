package EX9;
interface iShape{
    public void show();
    public int area();
}
interface iColor{
    public void showColor();
}
class Win implements iShape,iColor{
    public int width;
    public int height;
    public String color;
    public Win(int w,int h,String c){
        width=w;
        height=h;
        color=c;
    }
    public int area(){
        return width*height;
    }
    public void show(){
        System.out.println("width="+width);
        System.out.println("height="+height);
        System.out.println("area="+area());
        showColor();
    }
    public void showColor(){
        System.out.println("color="+color);
    }
}
public class ex9 {
    public static void main(String[] args) {
        Win w=new Win(5,7,"Green");
        w.show();
    }
}
