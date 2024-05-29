package Ex11;
import java.util.Random;
import java.util.TreeMap;
import java.util.HashSet;
public class ex11 {
    public static void main(String[] args) {
        Random r=new Random();
        TreeMap<Integer,Integer> tmap=new TreeMap<>();
        for(int i=0;i<5;i++){
            tmap.put(r.nextInt(100),i);
        }
        HashSet<Integer> hset=new HashSet<>(tmap.keySet());
        System.out.println(tmap);
        System.out.println(hset);
    }
}
