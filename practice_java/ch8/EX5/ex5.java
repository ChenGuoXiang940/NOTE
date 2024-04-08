package EX5;
class CBox{
    int length,width,height;
    CBox(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    double volume(){
        return length*width*height;
    }
    double surfaceArea(){
        return width*height;
    }
    void showData(){
        System.out.println("length="+length+
        " width="+width+" height="+height);
    }
    void showAll(){
        showData();
        System.out.println("表面積="+surfaceArea()+"體積="+volume());
    }
}
public class ex5 {
    public static void main(String[] args) {
        CBox box=new CBox(1,1,1);
        box.showAll();
    }
}
