package EX14;
class IllegalArgumentException extends Exception {
    IllegalArgumentException(String s) {
        super(s);
    }
}
class NotOddException extends Exception{
    NotOddException(String s){
        super(s);
    }
}
public class ex14 {
    public static void main(String args[]){
        int n=11;
        for(int i=1;i<=n;i+=2)
            odd(i);
        System.out.println();
    }
    public static void odd(int n){
        try{
            if(n<0){
                throw new IllegalArgumentException("n值小於等於0，無法處理");
            }
            else if(n%2==0){
                throw new NotOddException("n值為偶數");
            }
            else{
                System.out.print(n+" ");
            }
        }
        catch(IllegalArgumentException|NotOddException e){
            System.out.println(e.getMessage());
        }
    }
}
