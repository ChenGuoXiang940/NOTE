public class ex8 {
    public static void main(String[]args){
        int[][]arr= {{4,2},{3,4,6},{7,4,8,5}};
        int max=0;
        for(int[]col:arr){
            for(int row:col){
                System.out.print(row+" ");
                max=Math.max(max,row);
            }
            System.out.println();
        }
        System.out.println("max="+max);
    }
}
