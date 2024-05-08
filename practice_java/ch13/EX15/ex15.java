package EX15;
import java.util.Scanner;
class Exception520 extends Exception {
    Exception520(String s) {
        super(s);
    }
}
public class ex15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        try{
            if(s.equals("520")){
                throw new Exception520("這是由字串520所引起的例外");
            }
            else{
                System.out.println(s);
            }
        }
        catch(Exception520 e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
