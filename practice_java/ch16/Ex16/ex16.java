package Ex16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ex16 {
    public static void main(String[] args) {
        ArrayList<String>alist=new ArrayList<>();
        alist.addAll(Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"));
        ListIterator<String>it=alist.listIterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        ListIterator<String>it2=alist.listIterator(alist.size());
        while(it2.hasPrevious()){
            System.out.print(it2.previous()+" ");
        }
    }
}
