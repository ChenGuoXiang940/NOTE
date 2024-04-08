package EX19;
class Data{
    private String name;
    private Test score;
    Data(String na,int eng,int ma){
        this.name=na;
        this.score=new Test(eng,ma);
    }
    void show(){
        System.out.println("Name: "+name);
        System.out.println("English: "+score.english);
        System.out.println("Math: "+score.math);
        System.out.println("Average: "+score.avg());
    }
}
class Test{
    int english;
    int math;
    Test(int e,int m){
        this.english=e;
        this.math=m;
    }
    double avg(){
        return (double)(english+math)/2.0;
    }
}
public class ex19 {
    public static void main(String[] args) {
        Data stu=new Data("Annie", 85, 92);
        stu.show();
    }
}
