package EX11;
import java.util.Random;
class PrePaid extends Thread{
    private int sum=200;
    private volatile boolean exit = false;
    public void run(){
        Random rand = new Random();
        while(sum > 10){
            int fee = rand.nextInt(100);
            talk(fee);
            if(exit)return;
        }
    }
    private synchronized void talk(int fee){
        if(sum - fee > 10){
            sum -= fee;
            System.out.println("打了" + fee + "元，餘額" + sum + "元");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else{
            exit = true;
        }
    }
}
public class ex11 {
    public static void main(String[] args) {
        PrePaid phone1=new PrePaid();
        PrePaid phone2=new PrePaid();
        PrePaid phone3=new PrePaid();
        phone1.start();
        phone2.start();
        phone3.start();
    }
}
