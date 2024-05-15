package EX6;

import java.io.FileWriter;
import java.io.IOException;

public class ex6 {
    public static void main(String[] args) {
        char hi[]={'H','e','l','l','o',' ','J','a','v','a','!','\r','\n'};
        try {
            FileWriter writer = new FileWriter("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\hello.txt");
            writer.write(hi);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
