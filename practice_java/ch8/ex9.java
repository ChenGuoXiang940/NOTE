package practice_java.ch8;
class CWin{
    int width;
    int height;
    String name;

    void setW(int w){  // 設定寬度的函數      
        this.width=w;
    }
    void setH(int h){  // 設定高度的函數       
        this.height=h;
    }
    void setWindows(int w,int h){
        this.width=w;
        this.height=h;
    }
    void setWindows(int w,int h,String n){
        this.width=w;
        this.height=h;
        this.name=n;
    }
    void setName(String s){  // 設定視窗名稱的函數   
        name=s;
    }
    public void show(){
        System.out.println("Name="+name);
        System.out.println("W="+width+", H="+height);
    }    
}
public class ex9 {
    public static void main(String[] args){
        CWin cw=new CWin();
        cw.setName("My Windows");
        cw.setW(5);
        cw.setH(3);
        cw.show();
    }
}
