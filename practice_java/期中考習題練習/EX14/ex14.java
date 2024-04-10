package EX14;

public class ex14 {
    public static void main(String[] args) {
        int[]a={2,4,6};
        int[]b={5,10};
        int[]res=combine(a, b);
        for(int i=0;i<res.length;i++)System.out.println(res[i]);
    }
    public static int[]combine(int[]a,int[]b){
        int[] res=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            res[i]=a[i];
        }
        for(int j=0;j<b.length;j++){
            res[a.length+j]=b[j];
        }
        return res;
    }
}
