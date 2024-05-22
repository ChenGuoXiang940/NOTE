package EX6;
class T implements Runnable{
    private String id;
    private int time;
    public T(String id,int time){
        this.id = id;
        this.time = time;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(id+"is running...");
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ex6 {
    public static void main(String[] args) {
        T t1=new T("Thread1",1000);
        T t2=new T("Thread2",2500);
        Thread threadA = new Thread(t1);
        Thread threadB = new Thread(t2);
        threadA.start();
        threadB.start();
    }
}
