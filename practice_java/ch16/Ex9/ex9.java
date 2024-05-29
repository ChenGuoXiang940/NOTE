package Ex9;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Random;
public class ex9 {
    public static void main(String[] args) {
        Random r=new Random();
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<5;i++){
            hmap.put(i,r.nextInt(100));
        }
        TreeSet<Integer> tset=new TreeSet<>(hmap.values());
        HashSet<Integer> hset=new HashSet<>(hmap.keySet());
        System.out.println("HashMap: "+hmap);
        System.out.println("TreeSet: "+tset);
        System.out.println("HashSet: "+hset);
    }
}
