package practice_java.ch9;
class Summation{
    public static void add(int n){
        String str="1+2+...+"+Integer.toString(n)+"=";
        int sum=n*(1+n)/2;
        if(n>=3)System.out.println(str+sum);
        else System.out.println("n should be greater than 2");
    }
}
public class ex7 {
    public static void main(String[] args) {
        Summation.add(5);
        Summation.add(10);
    }
}
