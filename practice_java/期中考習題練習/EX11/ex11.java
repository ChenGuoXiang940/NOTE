package EX11;

public class ex11 {
    public static void main(String[] args) {
        System.out.println(total(10, 2, 2));
    }
    public static double total(double p,double r,int n){
        double res=1;
        double m=1+r;
        while(n>0){
            if((n&1)==1)res*=m;
            m=m*m;
            n>>=1;
        }
        return res*p;
    }
}
