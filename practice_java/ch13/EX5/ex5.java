package EX5;

public class ex5 {
    public static void main(String[] args) {
        int num=12;
        int[]den={12,0,3,0,0,4};
        for(int i=0;i<10;++i){
            try{
                System.out.println(num+"/"+den[i]+"="+num/den[i]);
            }catch(ArithmeticException e){
                System.out.println("除數為0");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("陣列索引超出了範圍");
                break;
            }
        }
    }
}
