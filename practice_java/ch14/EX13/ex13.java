package EX13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex13 {
    public static void main(String[] args) {
        Car c1=new Car("C 300 Estate", "white", 297);
        Car c2=new Car("5-Series Sedan M5","black", 716);
        try{
            FileOutputStream fos=new FileOutputStream("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\mycar.txt");
            c1.writeData(fos);
            c2.writeData(fos);
            fos.close();
            FileInputStream fis=new FileInputStream("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\mycar.txt");
            readData(fis);
            fis.close();
        }
        catch(IOException ex){
            System.out.println("Error");
        }
    }
    public static void readData(FileInputStream r)throws IOException{
        byte[] bytes = r.readAllBytes();
        String[] data = new String(bytes).split("\n");
        for(int i = 0; i < data.length; i+=3){
            System.out.println("車款: " + data[i]);
            System.out.println("顏色: " + data[i+1]);
            System.out.println("車價: " + data[i+2]);
        }
    }
}
class Car{
    public String module;
    public String color;
    public int price;
    public Car(String module, String color, int price){
        this.module = module;
        this.color = color;
        this.price = price;
    }
    public void writeData(FileOutputStream w)throws IOException{
        w.write((module + "\n" + color + "\n" + price + "\n").getBytes());
    }
}
