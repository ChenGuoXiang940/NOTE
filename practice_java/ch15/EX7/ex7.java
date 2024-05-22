package EX7;
class T implements Runnable{
    private String id;
    private int time;
    private int num;
    public T(String id,int time,int num){
        this.id = id;
        this.time = time;
        this.num = num;
    }
    @Override
    public void run(){
        for(int i=0;i<num;i++){
            System.out.println(id+"is running...");
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ex7 {
    public static void main(String[] args) {
        T t1=new T("Thread1",1000,5);
        T t2=new T("Thread2",2500,10);
        T t3=new T("Thread3",3500,5);
        Thread threadA = new Thread(t1);
        Thread threadB = new Thread(t2);
        Thread threadC = new Thread(t3);
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
