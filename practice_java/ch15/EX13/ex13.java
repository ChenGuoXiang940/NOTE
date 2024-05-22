package EX13;
import java.io.FileWriter;
import java.util.Random;
import java.io.IOException;
import java.util.Arrays;
class BSort extends Thread{
    private double[]data;
    public BSort(double[]data){
        this.data=data;
    }
    public void run(){
        for(int i=0;i<data.length-1;i++){
            for(int j=0;j<data.length-1-i;j++){
                if(data[j]>data[j+1]){
                    double temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }
        try{
            FileWriter fos=new FileWriter("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch15\\bresul.txt");
            for(int i=0;i<data.length;i++){
                fos.write(data[i]+"\n");
            }
            fos.close();
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}
class QSort extends Thread{
    private double[]data;
    public QSort(double[]data){
        this.data=data;
    }
    public void run(){
        Arrays.sort(data);
        try{
            FileWriter fos=new FileWriter("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch15\\qresult.txt");
            for(int i=0;i<data.length;i++){
                fos.write(data[i]+"\n");
            }
            fos.close();
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}
public class ex13 {
    public static void main(String[] args) {
        double[]data=new double[100000];
        Random rand=new Random();
        for(int i=0;i<data.length;i++){
            data[i]=rand.nextInt(10000);
        }
        Thread bsort=new BSort(data);
        Thread qsort=new QSort(data);
        bsort.start();
        qsort.start();
    }
}
