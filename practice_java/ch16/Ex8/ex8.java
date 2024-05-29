package Ex8;
import java.util.LinkedList;
public class ex8 {
    public static void main(String[] args) {
        LinkedList<String>alist=new LinkedList<>();
        alist.add("Homer sometimes nods.");
        alist.add("Beauty is in the eye of beholder.");
        alist.add("Example is better than precept.");
        alist.add("Learn to walk before you run.");
        alist.add("Make hay while the sun shines.");
        for(String s:alist){
            System.out.println(s);
        }
    }
}
