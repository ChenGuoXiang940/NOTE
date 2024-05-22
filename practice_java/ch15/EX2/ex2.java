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
public class ex2 {
    public static void main(String[] args) {
        Test hi=new Test("Hello");
        Test bye=new Test("Good Bye");
        Test morning=new Test("Good morning");
        Test night=new Test("Good night");
        hi.start();
        bye.start();
        morning.start();
        night.start();
    }
}
