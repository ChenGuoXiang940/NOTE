package practice_java.ch7;

public class ex4 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(is_even(i)){
                if(i%9==0)System.out.println(i);
            }
        }
    }
    public static boolean is_even(int n){
        return (n%2==0);
    }
}
