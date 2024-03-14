public class ex10 {
    public static void main(String[]args){
        int[] a={1,2,3,4};
        int[] b={9,8,7,6};
        for(int i=0;i<a.length;i++){
            int tmp=a[i];
            a[i]=b[i];
            b[i]=tmp;
        }
        System.out.println("a:"+java.util.Arrays.toString(a));
        System.out.println("b:"+java.util.Arrays.toString(b));
    }
}
