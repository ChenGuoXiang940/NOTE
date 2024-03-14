public class ex9 {
    public static void main(String[]args){
        int[][][] arr={{{15,85,36},{30,14,37},
            {47,23,96},{19,39,51}},
            {{22,16,51},{97,30,12},
            {68,77,26},{57,32,76}}};
        int min=(int)1E5;
        for(int[][]page:arr){
            for(int[]row:page){
                for(int col:row){
                    System.out.print(col+" ");
                    min=Math.min(min,col);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("min="+min);
    }
}
