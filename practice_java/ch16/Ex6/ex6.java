package Ex6;
import java.util.LinkedList;
import java.util.Random;
import java.util.Arrays;
public class ex6 {
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<>();
        Random r=new Random();
        for(int i=0;i<5;i++){
            llist.add(r.nextInt(100));
        }
        System.out.println("LinkedList: "+llist);
        llist.addAll(Arrays.asList(150,55,10));
        llist.set(5,999);
        System.out.println("LinkedList: "+llist);
        System.out.println("First: "+llist.getFirst());
        System.out.println("Last: "+llist.getLast());
        System.out.println("Sublist: "+llist.subList(2, 6));
    }
}
