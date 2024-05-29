package Ex14;
import java.util.Random;
import java.util.TreeSet;
public class ex14 {
    public static void main(String[] args) {
        Random r=new Random();
        TreeSet<Integer> tset=new TreeSet<>();
        for(int i=0;i<10;i++){
            tset.add(r.nextInt(100));
        }
        double sum=0;
        for(Integer it:tset){
            sum+=it;
        }
        System.out.println(tset);
        System.out.println(sum);
        System.err.println(sum/tset.size());
    }
}
