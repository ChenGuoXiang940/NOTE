package EX12;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ex12 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\rand.txt");
            writeData(fos);
            fos.close();
            FileInputStream fis=new FileInputStream("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\rand.txt");
            readData(fis);
            fis.close();
        }
        catch(IOException ex){
            System.out.println("Error");
        }
    }
    public static void writeData(FileOutputStream w)throws IOException{
        for(int i=0;i<1000;i++){
            String s=(int)(Math.random()*1E5-1)+" ";
            w.write(s.getBytes());
        }
    }
    public static void readData(FileInputStream r)throws IOException{
        byte[] bytes = r.readAllBytes();
        String[] numbers = new String(bytes).split(" ");
        int[] intNumbers = new int[numbers.length];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
            sum += intNumbers[i];
            max = Math.max(max, intNumbers[i]);
            min = Math.min(min, intNumbers[i]);
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    
        Arrays.sort(intNumbers);
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\rand2.txt")) {
            for (int number : intNumbers) {
                fos.write((number + " ").getBytes());
            }
        }
    }
}
