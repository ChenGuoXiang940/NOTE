package EX4;

public class ex4 {
    public static void main(String[] args) {
        int num=5;
        int[]d={3,0,0,1};
        for(int i=0;i<d.length;++i){
            try{
                System.out.println(num+"/"+d[i]+"="+num/d[i]);
            }catch(ArithmeticException e){
                System.out.println("除數為0不計算");
            }
        }
    }
}
