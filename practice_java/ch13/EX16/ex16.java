package EX16;
import java.util.Scanner;
class IntegerlessThanZero extends Exception{
    IntegerlessThanZero(String s){
        super(s);
    }
}
class IntegerGreatetThanZero extends Exception{
    IntegerGreatetThanZero(String s){
        super(s);
    }
}
class IntegerEqualToZero extends Exception{
    IntegerEqualToZero(String s){
        super(s);
    }
}
public class ex16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        try{
            if(n<0){
                throw new IntegerlessThanZero("這是由負整數所引起的例外");
            }
            else if(n>0){
                throw new IntegerGreatetThanZero("這是由正整數所引起的例外");
            }
            else{
                throw new IntegerEqualToZero("這是由零所引起的例外");
            }
        }
        catch(IntegerlessThanZero|IntegerGreatetThanZero|IntegerEqualToZero e){
            System.out.println(e.getMessage());
        }
    }
}
