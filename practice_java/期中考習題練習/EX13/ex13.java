package EX13;

public class ex13 {
    public static void main(String[] args) {
        long n=4;
        int res=0;
        while(res<9){
            if(is_prime(n-1)){
                System.out.println(n-1);
                if(++res==8)break;
            }
            n<<=1;
        }
    }
    public static boolean is_prime(long n){
        if(n==2||n==3)return true;
        long m=n%6;
        if(m!=1&&m!=5)return false;
        long sq=(long)Math.sqrt(n);
        for(long i=5;i<=sq;i+=6){
            if(n%i==0||n%(i+2)==0)return false;
        }
        return true;
    }
}
