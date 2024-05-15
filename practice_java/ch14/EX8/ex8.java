package EX8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ex8 {
    public static void main(String[] args) {
        String line;
        String toSkip = "You can't be perfect but you can be unique.";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\chen1\\OneDrive\\Desktop\\Department of Resources and Engineering\\NOTE\\practice_java\\ch14\\proverb.txt"));
            while ((line = reader.readLine()) != null) {
                if (!line.equals(toSkip)) {
                    System.out.println(line);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
