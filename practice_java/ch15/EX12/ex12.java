package EX12;
class CData extends Thread{
    private static int sum=30;
    private int n;
    private int sec;
    public CData(int a,int s){
        n=a;
        sec=s;
    }
    public void run(){
        while(sum>10){
            sub(n,sec);
        }
    }
    public static synchronized void sub(int a,int s){
        int tmp=sum-a;
        try{
            sleep(s);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        if(tmp>0){
            sum=tmp;
            System.out.println("減"+a+"後，餘額為"+sum);
        }
    }
}
public class ex12 {
    public static void main(String[] args) {
        CData d1=new CData(5, 1500);
        CData d2=new CData(9, 1000);
        CData d3=new CData(8, 2000);
        d1.start();
        d2.start();
        d3.start();
        // sum 沒有減同一個值
        // 使用 synchronized 確保在同一時間只有一個執行緒可以修改 sum 變數
    }
}
