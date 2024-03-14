public class ex1 {
    public static void main(String[] args) {
        int[]a={18,-51,23,35};
        int[]b={28,32,-35,40};
        int[]c=new int[4];
        for(int i=0;i<4;i++){
            c[i]=a[i]>b[i]?a[i]:b[i];
            System.out.println(c[i]);
        }
    }
}