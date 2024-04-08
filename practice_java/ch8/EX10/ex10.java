package EX10;
class CCircle{
    CCircle(){}
    double area(double r){
        return r*r*Math.PI;
    }
    double area(float r){
        return r*r*Math.PI;
    }
    double area(int r){
        return (double)r*(double)r*Math.PI;
    }
}
public class ex10 {
    public static void main(String[] args) {
        CCircle obj=new CCircle();
        System.out.println(obj.area(2));
        System.out.println(obj.area(2.2f));
        System.out.println(obj.area(2.2));
    }
}
