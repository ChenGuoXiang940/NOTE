package EX7;

public class ex7 {
    public static void main(String[] args) {
        int[]arr={75, 29, 38, 45, 16};
        System.out.println(argmin(arr));
    }
    public static int argmin(int[]arr){
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[index]>arr[i])index=i;
        }
        return index;
    }
}
