package practice_java.ch7;

public class ex3 {
    public static void main(String[] args) {
        System.out.println((is_even(5)?"是偶數":
        "不是偶數"));
    }
    public static boolean is_even(int n){
        return (n%2==0);
    }
}
