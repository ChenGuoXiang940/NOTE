package EX6;
public class ex6 {
    public static void main(String[]args){
        double[][]arr={
            {18.2,17.3,15.0,13.4},
            {23.8,25.1,20.6,17.8},
            {20.6,21.5,18.4,15.7}};
        double[]time={0,0,0};
        double[]day={0,0,0,0};
        //溫度最高的日子與時段
        double max=0,min=100;
        int maxday=0,minday=0;
        int maxtime=0,mintime=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                time[i]+=arr[i][j];
                day[j]+=arr[i][j];
                System.err.print(arr[i][j]+" ");
                if(arr[i][j]>max){
                    max=arr[i][j];
                    maxday=j;
                    maxtime=i;
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                    minday=j;
                    mintime=i;
                }
            }
            System.err.println();
        }
        for(int i=0;i<4;i++){
            System.out.println("星期"+(i+1)+"的平均溫度:"+Math.round(day[i]/3));
        }
        for(int i=0;i<3;i++){
            System.out.println("時段"+(i+1)+"的平均溫度:"+Math.round(time[i]/4));
        }
        System.out.printf("溫度最高的日子與時段:星期%d的時段%d\n",maxday+1,maxtime+1);
        System.out.printf("溫度最低的日子與時段:星期%d的時段%d\n",minday+1,mintime+1);
    }
}
