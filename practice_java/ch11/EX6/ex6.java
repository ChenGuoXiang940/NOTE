package EX6;
interface iShape{
    public void show();
    public int area();
}
class Color{
    public String color;
    public Color(String c){
        color=c;
    }
}
class Win extends Color implements iShape{
    public int width,height;
    public Win(int w,int h,String s){
        super(s);
        width=w;
        height=h;
    }
    public int area(){
        return width*height;
    }
    public void show(){
        System.out.println("width="+width);
        System.out.println("height="+height);
        System.out.println("color="+color);
        System.out.println("area="+area());
    }
}
public class ex6 {
    public static void main(String[] args) {
        Win w=new Win(5,7,"Red");
        w.show();
    }
}
