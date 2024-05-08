package EX8;

public class ex8 {
    public static void main(String[] args) {
        try {
            test(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
    static void test(int num,int den){
        System.out.println(num+"/"+den+"="+num/den);
    }    
}
