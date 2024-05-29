package Ex12;
import java.util.HashMap;
public class ex12 {
    public static void main(String[] args) {
        HashMap<String,Integer>hmap=new HashMap<>();
        hmap.put("Ryan",95);
        hmap.put("Fiona",83);
        hmap.put("Jack",98);
        hmap.put("Kevin",89);
        hmap.put("Ariel",92);
        System.out.println(hmap);
        System.out.println((hmap.get("Ariel")+hmap.get("Fiona")/2));
        System.out.println(Math.abs(hmap.get("Jack")-hmap.get("Kevin")));
    }
}
