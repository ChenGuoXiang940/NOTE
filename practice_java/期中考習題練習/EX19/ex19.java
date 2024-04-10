package EX19;
class Volume{
    public void show(){
        System.out.println("printed from class Volume");
    }
    public int vol(){
        return 1;
    }
}
class Box extends Volume{
    int length,width,height;
    Box(){
        this.length=this.width=this.height=1;
    }
    Box(int l,int w,int h){
        this.length=l;
        this.width=w;
        this.height=h;
    }
    public void show(){
        System.out.println("length="+length+",width="+width+
        ",height"+height);
    }
    public int vol(){
        return length*width*height;
    }
}
public class ex19 {
    public static void main(String[] args) {
        Box obj=new Box(2,3,4);
        Box obj2=new Box();
        obj.show();
        System.out.println(obj.vol());
        obj2.show();
        System.out.println(obj2.vol());
    }
}
