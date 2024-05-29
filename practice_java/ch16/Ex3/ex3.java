package Ex3;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
class ex3 {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();
        h1.add(36);
        h1.add(15);
        TreeSet<Integer> t1 = new TreeSet<>();
        t1.addAll(Arrays.asList(52,23,32,69,10,7,36));
        System.out.println("HashSet: "+h1);
        System.out.println("TreeSet: "+t1);
        if(t1.contains(32)){
            t1.remove(32);
        }
        else{
            System.out.println("t1中沒有元素32");
        }
        if(t1.containsAll(h1)){
            System.out.println("t1中包含h1的所有元素");
        }
        else{
            System.out.println("t1中不包含h1的所有元素");
        }
    }
}
