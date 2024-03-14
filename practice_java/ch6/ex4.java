public class ex4 {
    public static void main(String[]args){
        int[]arr={12,15,8,43};
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println("陣列元素的值:"+java.util.Arrays.toString(arr));
    }
}
