package Ex13;
import java.util.ArrayList;
import java.util.Random;
public class ex13 {
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList<Integer> alist=new ArrayList<>();
        for(int i=0;i<10;i++){
            alist.add(r.nextInt(100));
        }
        System.out.println(alist);
    }
}
