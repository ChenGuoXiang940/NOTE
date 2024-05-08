package EX7;

public class ex7 {
    public static void main(String args[]){
        int[] a={64,15,47,23,96,38};   
        int[] d={3,0,7,9,14,0};      
        int sum=0;
        for(int i=0;i<=6;i++)          
            try{
                sum+=a[i]/d[i];
            }catch(ArithmeticException e){
                System.out.println("除數為0");}
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("陣列索引超出了範圍");
                break;
            }         
        System.out.println("sum="+sum);
    }
}
