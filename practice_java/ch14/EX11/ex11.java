package EX11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex11 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\rand99.txt");
            writeData(fos);
            fos.close();
            FileInputStream fis=new FileInputStream("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\rand99.txt");
            cnt(fis);
            fis.close();
        }
        catch(IOException ex){
            System.out.println("Error");
        }
    }
    public static void writeData(FileOutputStream w)throws IOException{
        for(int i=0;i<100;i++){
            w.write((char)('a'+Math.random()*26));
        }
    }
    public static void cnt(FileInputStream r)throws IOException{
        int[]num={0,0,0,0,0};
        int[]ch={'a','e','i','o','u'};
        while(r.available()>0){
            int data=r.read();
            for(int i=0;i<5;i++){
                if((int)data==ch[i]){
                    num[i]++;
                    break;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.err.println(ch[i]+":"+num[i]);
        }
    }
}
