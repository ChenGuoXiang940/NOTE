package practice_java.ch9;
class MinMax{
    private int[]arr;
    MinMax(int[]a){
        arr=a;
    }
    void find_min_max(){
        if(arr.length==0){
            System.out.println("Array is "
            +"empty");
            return;
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Min= "+min+" Max= "+max);
    }
}
public class ex4 {
    public static void main(String[] args) {
        int[]a={12,54,23,17,90};
        MinMax obj=new MinMax(a);
        obj.find_min_max();
    }
}
