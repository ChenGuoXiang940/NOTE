package EX15;

public class ex15 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }   
    public static int sum(int n){
        if(n==1)return 2;
        return sum(n-1)+2*n;
    }
}
