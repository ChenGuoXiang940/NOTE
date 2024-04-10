package EX7;

public class ex7 {
    public static void main(String[] args) {
        int[][]arr={{68,45,56,85,76},{77,63,65,45,23},{43,
            55,97,78,61}};
        int[] num1=new int[3];
        int[] num2=new int[5];
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                num1[i]+=arr[i][j];
                num2[j]+=arr[i][j];
            }
        }
        int index1=0;
        String[]times={"早上","下午","晚上"};
        for(int i=0;i<3;i++){
            System.out.println(times[i]+":"+num1[i]);
            if(num1[index1]<num1[i])index1=i;
        }
        int index2=0;
        for(int i=0;i<5;i++){
            System.out.println("水果"+(char)('A'+i)+":"+num2[i]);
            if(num2[index2]<num2[i])index2=i;
        }
        System.out.println("最好:"+times[index1]);;
        System.out.println("最好:水果"+(char)('A'+index2));
    }
}
