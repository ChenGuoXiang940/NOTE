public class ex3 {
    public static void main(String[] args){
        int[]arr={3,5,0,3,2,4,1,6,8,5,4,3,2};
        int count=0,count1=0;
        for(int item:arr){
            count++;
            if(item>=3&&item<=6){
                count1++;
            }
        }
        System.out.printf("所有算的個數：%d\n",count);
        System.out.printf("介於3到6之間的個數：%d\n",count1);
    }
}
