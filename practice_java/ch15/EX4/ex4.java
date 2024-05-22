package EX4;
class MyPrint implements Runnable{
    private int n;
    private char ch;
    public MyPrint(int a,char c){
        n=a;
        ch=c;
    }
    @Override
    public void run(){
        for(int i=0;i<n;i++){
            System.out.print(ch);
        }
    }
}
public class ex4 {
    public static void main(String[] args) {
        MyPrint s1=new MyPrint(5, '*');
        MyPrint s2=new MyPrint(3, '$');
        Thread thread1 = new Thread(s1);
        Thread thread2 = new Thread(s2);
        thread1.start();
        thread2.start();
    }
}
