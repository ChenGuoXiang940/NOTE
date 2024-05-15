package EX2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ex2 {
    public static void main(String[] args) {
        BufferedReader buf;
        String str;
        try{
            buf=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Input a string:");
            str=buf.readLine();
            String res="";
            for(int i=0;i<str.length();i++){
                res+=(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ? (char)(str.charAt(i) - 32) : str.charAt(i);
            }
            System.out.println("string = "+res);
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
    
}
