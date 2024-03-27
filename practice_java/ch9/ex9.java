package practice_java.ch9;
class MyClip{
    int low;
    int high;
    MyClip(int lo,int hi){
        this.low=lo;
        this.high=hi;
    }
    void set_range(int lo,int hi){
        this.low=lo;
        this.high=hi;
    }
    void clip(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<low)arr[i]=low;
            if(arr[i]>high)arr[i]=high;
        }
    }
    void print_arr(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class ex9 {
    public static void main(String[] args) {
        int[]a={-4,190,300,12,-7,8};
        int[]b={0,2,4,3,6,7};
        MyClip obj=new MyClip(0,255);
        obj.clip(a);
        obj.print_arr(a);
        obj.set_range(3, 5);
        obj.clip(b);
        obj.print_arr(b);
    }
}
