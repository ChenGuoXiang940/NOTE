package EX10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ex10 {
    public static void main(String[] args) {
        Data stu1=new Data("Ariel", 92, 85);
        Data stu2=new Data("Fiona", 67, 89);
        try{
            BufferedWriter w1=new BufferedWriter(new FileWriter("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\student.txt"));
            stu1.writeData(w1);
            stu2.writeData(w1);
            w1.close();
            BufferedReader r1=new BufferedReader(new FileReader("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\student.txt"));
            stu1.show(r1);
            stu2.show(r1);
            r1.close();
        }catch(IOException ex){
            System.out.println("Error");
        }
    }
}
class Data{
    private String name;
    private int english;
    private int math;
    public Data(String name,int english,int math){
        this.name=name;
        this.english=english;
        this.math=math;
    }
    public void show(BufferedReader r)throws IOException{
        String line;
        while((line=r.readLine())!=null){
            System.out.println(line);
        }
    }
    public void writeData(BufferedWriter w)throws IOException{
        String line=("姓名:"+name+"\r\n英文成績:"+english+"\r\n數學成績:"+math+"\r\n平均成績:"+((english+math)/2));
        w.write(line+'\n');
    }
}
