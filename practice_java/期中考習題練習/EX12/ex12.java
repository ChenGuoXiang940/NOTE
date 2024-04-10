package EX12;

public class ex12 {
    public static void main(String[] args) {
        System.out.println(prime(100));
    }
    public static int prime(int n){
        if(n==1)return 2;
        if(n==2)return 3;
        int res=2;
        for(int i=5;i<=1E5;i+=6){
            if(is_prime(i)){
                if(++res==n)return i;
            }
            if(is_prime(i+2)){
                if(++res==n)return i+2;
            }
        }
        return -1;
    }
    public static boolean is_prime(int n){
        if(n==2||n==3)return true;
        int m=n%6;
        if(m!=1&&m!=5)return false;
        int sq=(int)Math.sqrt(n);
        for(int i=5;i<=sq;i+=6){
            if(n%i==0||n%(i+2)==0)return false;
        }
        return true;
    }
}
