import java.io.FileReader;
import java.io.IOException;
public class ex5 {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\donkey.txt");
            int c;
            String s="";
            String[]str=new String[10];
            int index=0;
            while((c=fr.read())!=-1){
                if((char)c=='\n'&&s!=""){
                    str[index++]=s;
                    s="";
                }
                else{
                    s+=(char)c;
                }
            }
            if(s!="")str[index++]=s;
            for(int i=1;i<=2;i++){
                System.out.println(str[i]);
            }
            fr.close();
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
