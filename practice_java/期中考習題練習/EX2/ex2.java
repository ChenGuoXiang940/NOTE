package EX2;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        if(x==0)System.out.println("y軸");
        else if(y==0)System.out.println("x軸");
        else{
            if(x>0&&y>0)System.out.println("第一象限");
            else if(x<0&&y>0)System.out.println("第二象限");
            else if(x<0&&y<0)System.out.println("第三象限");
            else System.out.println("第四象限");
        }
    }
}
