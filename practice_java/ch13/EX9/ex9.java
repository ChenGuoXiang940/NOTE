package EX9;
class Test{
    public static void test(int num,int den){
        System.out.println(num+"/"+den+"="+num/den);
    }
}
public class ex9 {
    public static void main(String[] args) {
        try {
            Test.test(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    } 
}
