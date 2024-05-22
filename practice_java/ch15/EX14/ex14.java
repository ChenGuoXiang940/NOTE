package EX14;
class Isprime{
    public static boolean isprime(int d){
        for(int i=2;i<=Math.sqrt(d);i++){
            if(d%i==0)return false;
        }
        return true;
    }
}
class P1 extends Thread{
    public void run(){
        int sum=1;
        for(int i=3;i<=100000;i++){
            if(Isprime.isprime(i))sum++;
        }
        System.out.println("2~100000之間的質數有"+sum+"個");
    }
}
class P2 extends Thread{
    public void run(){
        int sum=0;
        for(int i=100001;i<=200000;i++){
            if(Isprime.isprime(i))sum++;
        }
        System.out.println("100001~200000之間的質數有"+sum+"個");
    }
}
public class ex14 {
    public static void main(String[] args) {
        Thread p1=new P1();
        Thread p2=new P2();
        p1.start();
        p2.start();
        // 100001~200000之間的質數有8392個
        // 2~100000之間的質數有9592個
        // 2~100000之間的質數比  10001~200000之間的質數多
    }    
}
