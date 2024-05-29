package Ex4;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
public class ex4 {
    public static void main(String[] args) {
        HashSet<Integer>hset=new HashSet<>();
        hset.addAll(Arrays.asList(65,29,18,34));
        TreeSet<Integer>tset=new TreeSet<>();
        tset.addAll(Arrays.asList(97,62,53));
        tset.addAll(hset);
        System.out.println("tset: "+tset);
        System.out.println((tset.first()+tset.last())/2);
    }
}
