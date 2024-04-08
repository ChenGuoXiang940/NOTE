package EX2;
public class ex2 {
    public static void main(String[] args){
        int[]arr={53,27,69,12,3,96};
        int oddCount = 0, evenCount = 0;
        int maxOdd = 1, maxEven = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
                if (num > maxEven) {
                    maxEven = num;
                }
            } else {
                oddCount++;
                if (num > maxOdd) {
                    maxOdd = num;
                }
            }
        }
        System.out.println("所有元素的值:"+java.util.Arrays.toString(arr));
        System.out.printf("奇數有 %d 個，偶數有 %d 個\n", oddCount, evenCount);
        System.out.printf("元素值為奇數且為該陣列中奇數的最大值，最大值預設為1：%d\n",maxOdd);
        System.out.printf("元素值為偶數且為該陣列中偶數的最大值，最大值預設為0：%d\n",maxEven);
    }
}
