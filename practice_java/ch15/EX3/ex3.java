package EX3;
class Add implements Runnable{
    private int n;
    private int sum=0;
    public Add(int a){
        n=a;
    }
    @Override
    public void run(){
        for(int i=1;i<=n;i++){
            sum+=i;
        }
    }
    public int getSum(){
        return sum;
    }
}
public class ex3 {
    public static void main(String[] args) {
        Add a=new Add(5);
        Add b=new Add(10);
        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);
        threadA.start();
        threadB.start();
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a.getSum());
        System.out.println(b.getSum());
    }
}
