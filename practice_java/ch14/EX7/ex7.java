package EX7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex7 {
    public static void main(String[] args) {
        char hi[]={'W','e','l','c','o','m','e','!','\r','\n'};
        try {
            FileReader fr = new FileReader("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\hello.txt");
            String s="";
            String[]str=new String[10];
            int index=0;
            int c;
            while((c=fr.read())!=-1){
                if((char)c=='\n'&&s!=""){
                    str[index++]=s;
                    s="";
                }
                else{
                    s+=(char)c;
                }
            }
            fr.close();
            FileWriter writer = new FileWriter("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\hello.txt");
            for(int i=0;i<index;i++){
                writer.write(str[i]+'\n');
            }
            writer.write(hi);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
