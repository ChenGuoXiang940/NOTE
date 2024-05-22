package EX9;
class T implements Runnable{
    private int time;
    private String s;
    public T(int a,String b){
        time=a;
        s=b;
    }
    @Override
    public void run(){
        int count=1;
        while(true){
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s+" "+count++);
        }
    }
}
public class ex9 {
    public static void main(String[] args) {
        T hi=new T(1000, "Hello");
        T bye=new T(2500, "Good bye");
        Thread threadA = new Thread(hi);
        Thread threadB = new Thread(bye);
        threadA.start();
        threadB.start();
    }
}
