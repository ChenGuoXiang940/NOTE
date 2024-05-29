package Ex7;
import java.util.LinkedList;
import java.util.Arrays;
public class ex7 {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.addAll(Arrays.asList("apple","guava"));
        System.out.println("LinkedList: "+llist);
        LinkedList<String> alist = new LinkedList<>();
        alist.addAll(Arrays.asList("tomato","apple","papaya","grape"));
        System.out.println("LinkedList: "+alist);
        alist.addAll(1,llist);
        System.out.println("LinkedList: "+alist);
        System.out.println(alist.indexOf("apple"));
        System.out.println(alist.lastIndexOf("apple"));
    }
}
