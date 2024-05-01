package EX1.subpack1;
public class Max{
    private int n1,n2;
    public Max(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public int compare(){
        if(n1>=n2)return n1;
        else return n2;
    }
}