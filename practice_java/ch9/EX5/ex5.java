package EX5;
class Average{
    private int[][]arr;
    private double avg;
    Average(int[][]a){
        arr=a;
        double sum=0;
        double count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            count+=arr[i].length;
        }
        avg=sum/count;
    }
    void print_avg(){
        System.out.printf(
            "Average= %.2f\r\n",avg);
    }
    void print_arr(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class ex5 {
    public static void main(String[] args) {
        int[][]a={{12,54,23},{21,12,25}};
        Average obj=new Average(a);
        obj.print_avg();
        obj.print_arr();
    }
}
