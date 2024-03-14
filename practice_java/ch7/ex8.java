package practice_java.ch7;

public class ex8 {
    public static void main(String[] args) {
        int[][]arr={{1, 3, 5},{8, 9,2}};
        square(arr);
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void square(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=(int)Math.pow(arr[i][j], 2);
            }
        }
    }
}
