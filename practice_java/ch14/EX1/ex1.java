package EX1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ex1 {
    public static void main(String[] args) {
        BufferedReader buf;
        String str;
        try{
            buf=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Input a string:");
            str=buf.readLine();
            System.out.println("string = "+str);
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}