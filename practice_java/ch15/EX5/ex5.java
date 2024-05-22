package EX5;
class Sub implements Runnable {
    private int n;
    private int sum=1;
    public Sub(int a){
        n=a;
    }
    @Override
    public void run() {
        for(int i=1;i<=n;i++){
            sum*=i;
        }
    }
    public int getSum(){
        return sum;
    }
}
public class ex5 {
    public static void main(String[] args) {
        Sub a=new Sub(5);
        Sub b=new Sub(10);
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
