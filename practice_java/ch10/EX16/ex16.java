package EX16;
class Rectangle{
    protected int width,height;
    Rectangle(int w,int h){
        width=w;
        height=h;
    }
    @Override
    public String toString() {
        return "width="+width+" height="
        +height+"area="+(0.5*width*height);
    }
}
public class ex16 {
    public static void main(String[] args) {
        Rectangle rect=new Rectangle(20,60);
        System.out.println(rect);
    }
}
