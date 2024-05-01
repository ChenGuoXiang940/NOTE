package EX16;
public class ex16 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    public static double f(int x) {
        if(x==0) return 0;
        return Math.sqrt(x)+f(x-1);
    }
}