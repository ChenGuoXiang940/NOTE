package EX10;
interface Data{
    public void best();
    public void failed();
}
interface Test extends Data{
    public void showData();
    public double average();
}
class Stu implements Test{
    protected String name;
    protected int math;
    protected int english;
    public Stu(String n,int m,int e){
        name=n;
        math=m;
        english=e;
    }
    public void best(){
        if(math>english){
            System.out.println(name+"的數學比英文好");
        }else{
            System.out.println(name+"英文比數學好");
        }
    }
    public void failed(){
        if(math<60){
            System.out.println(name+"數學被當掉了");
        }
        if(english<60){
            System.out.println(name+"英文被當掉了");
        }
    }
    public void showData(){
        System.out.println("name="+name);
        System.out.println("math="+math);
        System.out.println("english="+english);
    }
    public double average(){
        return (math+english)/2;
    }
    public void show(){
        showData();
        System.out.println("average="+average());
        best();
        failed();
    }
}
public class ex10 {
    public static void main(String[] args) {
        Stu s=new Stu("july",58,91);
        s.show();
    }
}
