package EX19;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class IllegalArgument extends Exception{
    public IllegalArgument(String s){
        super(s);
    }
}
class NotEven extends Exception{
    public NotEven(String s){
        super(s);
    }
}
public class ex19 {
    public static void main(String[] args) {
        int n;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
            br.close();
            for(int i=0;i<=n;i+=2){
                even(i);
            }
        }catch(IOException|NumberFormatException|IllegalArgument|NotEven e){
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
    public static void even(int n)throws IllegalArgument, NotEven{
        if(n<0){
            throw new IllegalArgument(n+"小於0，無法除理");
        }
        else
        if(n%2!=0){
            throw new NotEven(n+"不是偶數，無法除理");
        }
        else{
            System.out.println(n);
        }
    }
}
