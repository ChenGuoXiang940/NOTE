package practice_java.ch7;

public class ex10 {
    public static void main(String[] args) {
        System.out.println(rsum(5));
    }
    public static int rsum(int n){
        if(n==0)return 0;
        return (n-1)*n+rsum(n-1);
    }
}
