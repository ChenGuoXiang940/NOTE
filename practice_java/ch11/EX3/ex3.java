package EX3;
abstract class Shape{
    protected int width;
    protected int height;
    public void show(){
        System.out.println("width="+width);
        System.out.println("height="+height);
        System.out.println("area="+area());
    }
    public abstract int area();
}
class Win extends Shape{
    public Win(int w, int h){
        width=w;
        height=h;
    }
    public int area(){
        return width*height;
    }
}
public class ex3 {
    public static void main(String[] args) {
        Win w=new Win(5,7);
        w.show();
    }
}
