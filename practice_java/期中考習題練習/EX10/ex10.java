package EX10;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(is_prime(n));
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
