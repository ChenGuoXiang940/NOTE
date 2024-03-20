package practice_java.ch8;
class CTest{
    public void test(int val){
        System.out.println(((val&0x1)==1?"此數是奇數":
        "此數是偶數"));
    }
}
public class ex7 {
    public static void main(String[] args) {
        CTest obj=new CTest();
        obj.test(3);
        obj.test(8);
        obj.test(0);
    }
}
