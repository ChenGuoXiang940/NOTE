package EX13;
class NotTrangle extends Exception{
    NotTrangle(String s){
        super(s);
    }
}
class EquilateralTraingle extends Exception{
    EquilateralTraingle(String s){
        super(s);
    }
}
class NotEquilateralTraingle extends Exception{
    NotEquilateralTraingle(String s){
        super(s);
    }
}
public class ex13 {
    public static void main(String[] args) {
        triangle(3,3,3);
    }
    public static void triangle(int a,int b,int c){
        try{
            if((a+b)<c||(a+c)<b||(b+c)<a){
                throw new NotTrangle("不構成三角形");
            }
            else if(a==b&&a==c&&b==c){
                throw new EquilateralTraingle("這是正三角形");
            }
            else{
                throw new NotEquilateralTraingle("這不是正三角形");
            }
        }catch(NotTrangle|EquilateralTraingle|NotEquilateralTraingle e){
            System.out.println(e.getMessage());
        }
    }
}
