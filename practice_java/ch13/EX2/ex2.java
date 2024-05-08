package EX2;
public class ex2 {
    public static void main(String[] args) {
        int num=12,dan=0;
        int ans;
        try{
            ans=num/dan;
            System.out.println(ans);
        }
        catch(ArithmeticException e){
            ans=0;
            System.out.println(e);
        }
    }
}