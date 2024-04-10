package EX3;

public class ex3 {
    public static void main(String[] args) {
        int res=0;
        for(int i=1;i<=50;i++){
            if((i&1)==1)res+=i*i;
            else res-=i*i;
        }
        System.out.println(res);
    }
}
