package EX3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ex3 {
    public static void main(String[] args) {
        BufferedReader buf;
        String str;
        try{
            buf=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Input a string:");
            str=buf.readLine();
            int val = Integer.parseInt(str);
            System.out.println((1+val)*val/2);
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
    
}
