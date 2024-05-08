package EX18;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ArgumentOutOfBound extends Exception{
    public ArgumentOutOfBound(String s){
        super(s);
    }

}
public class ex18 {
    public static void main(String[] args) {
        int n;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
            br.close();
            if(n<1){
                throw new ArgumentOutOfBound(n+"小於或等於2");
            }
            else{
                System.out.println(prime(n));
            }
        }catch(IOException|NumberFormatException|ArgumentOutOfBound e){
            System.out.println(e.getMessage());
        }
    }
    public static boolean prime(int n){
        if(n==1) return false;
        if(n==2||n==3)return true;
        int m=n%6;
        if(m!=1&&m!=5)return false;
        int sq=(int)Math.sqrt(m);
        for(int i=5;i<=sq;i+=6){
            if(n%i==0||n%(i+2)==0)return false;
        }
        return true;
    }
}
