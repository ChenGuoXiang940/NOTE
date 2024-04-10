package EX9;
import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(power(x,y));
    }
    public static int power(int x,int y){
        if(y==0||x==1)return 1;
        int res=1;
        while (y>0) {
            if((y&1)==1)res*=x;
            x=x*x;
            y>>=1;
        }
        return res;
    }
}
