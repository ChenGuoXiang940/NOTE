package EX10;
class Test{
    public void test(int num,int den){
        System.out.println(num+"/"+den+"="+num/den);
    }
}
public class ex10 {
    public static void main(String[] args) {
        try {
            Test t = new Test();
            t.test(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    } 
}
