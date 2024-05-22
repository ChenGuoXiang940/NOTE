package EX1;
class Test extends Thread{
    public String id;
    Test(String id){
        this.id=id;
    }
    public void run(){
        for(int i=1;i<=5;++i){
            for(int j=0;j<1E8;++j){
                System.out.println(id+" "+i);
            }
        }
    }
}
public class ex1 {
    public static void main(String[] args) {
        Test hi=new Test("Hello");
        Test bye=new Test("Good Bye");
        hi.start();
        bye.start();
    }   
    // 同時執行兩個Thread
}