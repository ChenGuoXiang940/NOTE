package practice_java.ch9;
class MyMath{
    MyMath(){}
    void mypower(int a,int b){
        int result=1;
        int rd_a=a,rd_b=b;
        while (b>0) {
            if((b&1)==1)result=result*a;
            b>>=1;
            a=a*a;
        }
        System.out.printf("%d的%d次方=%d\n",rd_a,rd_b,result);
    }
}
class ex8{
    public static void main(String[] args) {
        MyMath p1=new MyMath();
        MyMath p2=new MyMath();
        p1.mypower(2, 5);
        p2.mypower(3, 4);
    }
}