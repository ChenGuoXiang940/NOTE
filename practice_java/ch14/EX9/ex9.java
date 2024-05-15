package EX9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ex9 {
    public static void main(String[] args) {
        try{
            BufferedReader r1 = new BufferedReader(new FileReader("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\aaa.txt"));
            BufferedReader r2=new BufferedReader(new FileReader("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\bbb.txt"));
            BufferedWriter b1=new BufferedWriter(new FileWriter("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\ccc.txt"));
            String line;
            while((line=r1.readLine())!=null){
                b1.write(line+'\n');
            }
            while((line=r2.readLine())!=null){
                b1.write(line+'\n');
            }
            r1.close();
            r2.close();
            b1.close();
        }
        catch(IOException ex){
            System.out.println("Error");
        }
    }
}
