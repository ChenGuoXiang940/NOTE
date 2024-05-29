package Ex15;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class ex15 {
    public static void main(String[] args) {
        Random r=new Random();
        LinkedList<Integer> llist=new LinkedList<>();
        for(int i=0;i<10;i++){
            llist.add(r.nextInt(100));
        }
        double sum=0;
        ListIterator<Integer>it=llist.listIterator(llist.size());
        while (it.hasPrevious()) {
            int current = it.previous();
            System.out.print(current + " ");
            sum += current;
        }
        System.out.println();
        System.out.println(sum);
        System.err.println(sum/llist.size());
    }
}
