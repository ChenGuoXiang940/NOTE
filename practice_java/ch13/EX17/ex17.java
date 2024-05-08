package EX17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ArgumentOutOfBound extends Exception {
    ArgumentOutOfBound(String s) {
        super(s);
    }
}
public class ex17 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            br.close();
            mySqrt(n);
        }catch(IOException|NumberFormatException|ArgumentOutOfBound e){
            System.out.println(e.getMessage());
        }
    }
    public static void mySqrt(int n) throws ArgumentOutOfBound {
        if (n < 0) {
            throw new ArgumentOutOfBound(n + "小於0");
        } else {
            System.out.println(Math.sqrt(n));
        }
    }
}
