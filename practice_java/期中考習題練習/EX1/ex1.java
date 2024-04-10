package EX1;
import java.util.Scanner;
public class ex1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("購買價格：");
        int buy=sc.nextInt();
        System.out.print("付款：");
        int pay=sc.nextInt();
        int res=pay-buy;
        int[]num={500,100,50,10,5,1};
        for(int i=0;i<num.length;i++){
            System.out.println("$"+num[i]+"="+res/num[i]);
            res%=num[i];
        }
    }
}