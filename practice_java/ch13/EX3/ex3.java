package EX3;
public class ex3 {
    public static void main(String[] args) {
        int[]arr={18,29,13,38,15,62};
        int den=5;
        try{
            for(int i=0;i<=10;++i){
                System.out.println(arr[i]+"/"+den+"=");
                arr[i]/=den;
                System.out.println(arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("超過陣列大小");
        }
        System.out.println("End of main() method!");
    }
}
