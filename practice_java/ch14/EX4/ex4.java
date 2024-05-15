package EX4;
import java.io.FileReader;
import java.io.IOException;
public class ex4 {
    public static void main(String[] args) {
        int charCount=0;
        try{
            FileReader fr = new FileReader("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\donkey.txt");
            int c;
            String s="";
            while((c=fr.read())!=-1){
                charCount++;
                s+=(char)c;
            }
            System.out.println("內容: \r\n"+s);
            System.out.println("字數: "+charCount);
            fr.close();
        }
        catch(IOException e){
            System.out.println("Error");
        }
        //中文讀入與實際字數不符
        //ANS: 中文為2bytes, 英文為1byte
    }
}
