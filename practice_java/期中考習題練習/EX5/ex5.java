package EX5;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long val=sc.nextLong();
        int[]num=new int[10];
        while (val>0) {
            num[(int)(val%10)]++;
            val/=10;
        }
        for(int i=0;i<10;i++){
            System.out.println(i+"出現"+num[i]+"次");
        }
    }
}
