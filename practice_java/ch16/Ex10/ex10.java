package Ex10;
import java.util.Random;
import java.util.TreeMap;
public class ex10 {
    public static void main(String[] args) {
        Random r=new Random();
        TreeMap<Integer,Integer> tmap=new TreeMap<>();
        for(int i=1;i<=5;i++){
            tmap.put(i,r.nextInt(100));
        }
        System.out.println("TreeMap: "+tmap);
        int sum=0;
        for(int i:tmap.values()){
            sum+=i;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+(double)sum/tmap.size());
    }
}
