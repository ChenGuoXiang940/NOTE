package practice_java.ch7;

public class ch12 {
    public static void main(String[] args) {
        System.out.println(area(2));
        System.out.printf("%.2f",area(2.3));
    }

    public static int area(int r) {
        return (int) (3.14 * r * r);
    }

    public static double area(double r) {
        return 3.14 * r * r;
    }
}
