package EX8;
class Stu{
    protected String id;
    protected String name;
    protected int mid;
    protected int finl;
    protected int common;
    public Stu(String i,String n,int m,int f,int c){
        id=i;
        name=n;
        mid=m;
        finl=f;
        common=c;
    }
    public void show(){
        showData();
        showScore();
    }
    public void showData(){
        System.out.println("id="+id);
        System.out.println("name="+name);
    }
    public void showScore(){
        System.out.println("mid="+mid);
        System.out.println("finl="+finl);
        System.out.println("common="+common);
    }
    public double calcu(){
        return mid*0.3+finl*0.4+common*0.3;
    }
}
interface Data{
    public void showData();
}
interface Test{
    public void showScore();
    public double calcu();
}
public class ex8 {
    public static void main(String[] args) {
        Stu stu=new Stu("940001","fiona",90,92,85);
        stu.show();
    }
}
