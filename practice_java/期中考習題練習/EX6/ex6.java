package EX6;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]days={"Monday","Tuesday","Wednesday",
        "Thursday","Friday","Saturday","Sunday"};
        int index=sc.nextInt();
        System.out.println(days[index-1]);
    }
}