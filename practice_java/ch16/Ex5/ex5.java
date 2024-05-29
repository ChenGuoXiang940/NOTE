package Ex5;
import java.util.Arrays;
import java.util.TreeSet;
public class ex5 {
    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<>();
        tset.addAll(Arrays.asList("Speech is silver, silence is golden.".split(" ")));
        tset.addAll(Arrays.asList("Two heads are better than one.".split(" ")));
        tset.addAll(Arrays.asList("East or west, home is best.".split(" ")));
        tset.addAll(Arrays.asList("It is never too late to learn.".split(" ")));
        System.out.println(tset);
        System.out.println("First: "+tset.first());
        System.out.println("Last: "+tset.last());
        System.out.println(tset.headSet("Speech"));
    }
}
