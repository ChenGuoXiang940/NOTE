package EX6;

public class ex6 {
    public static void main(String[] args) {
        int[]arr={75,29,38,45,16};
        System.out.println(min(arr));
    }
    public static int min(int[]arr){
        int min=(int)1E5;
        for(int item:arr){
            min=Math.min(item, min);
        }
        return min;
    }
}
