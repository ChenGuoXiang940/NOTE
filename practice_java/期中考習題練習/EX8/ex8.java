package EX8;

public class ex8 {
    public static void main(String[] args) {
        int index_x=0,index_y=0;
        int[][]arr={{37,16,43},{12,18,94}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                if(arr[index_x][index_y]<arr[i][j]){
                    index_x=i;
                    index_y=j;
                }
            }
        }
        System.out.println("row="+(index_x)+",col="+(index_y));
    }
}
