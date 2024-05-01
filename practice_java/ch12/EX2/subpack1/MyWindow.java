package EX2.subpack1;
public class MyWindow{
    private int width;
    private int height;
    private String name;      
    
    public MyWindow(int w, int h, String s){
        width=w;
        height=h;
        name=s;
    }
    public void show(){
        System.out.println("Name="+name);
        System.out.println("W="+width+", H="
        +height);  
    }  
}  