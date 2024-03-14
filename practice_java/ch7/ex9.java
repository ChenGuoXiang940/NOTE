package practice_java.ch7;

public class ex9 {
    public static void main(String[] args) {
        System.out.println(fib_for(6));
        System.out.println(fib_rec(6));
        // for 效率最高
    }
    public static int fib_for(long n){
        if(n==1)return 1;
        if(n==2)return 2;
        int n1=1,n2=1;
        n-=2;
        for(int i=0;i<n;i++){
            int tmp=n2;
            n2=n1+n2;
            n1=tmp;
        }
        return n2;
    }
    public static int fib_rec(long n){
        if(n<=2)return 1;
        return fib_rec(n-1)+fib_rec(n-2);
    }
}
