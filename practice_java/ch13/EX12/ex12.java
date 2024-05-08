package EX12;
class CenterException extends Exception {
    CenterException(String s) {
        super(s);
    }
}

class OutException extends Exception {
    OutException(String s) {
        super(s);
    }
}

class InException extends Exception {
    InException(String s) {
        super(s);
    }
}
class Circle{
    double x1,y1,x2,y2;
    double radius=10.0;
    Circle(double a,double b,double c,double d){
        x1=a;
        y1=b;
        x2=c;
        y2=d;
    }
    public void check(){
        double dist=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        try {
            if (dist == 0) {
                throw new CenterException("(" + x1 + "," + y1 + ")在半徑" + radius + ", 圓心(" + x2 + "," + y2 + ")的圓心上");
            } else if (dist <= radius) {
                throw new InException("(" + x1 + "," + y1 + ")在半徑" + radius + ", 圓心(" + x2 + "," + y2 + ")的圓內");
            } else {
                throw new OutException("(" + x1 + "," + y1 + ")不在半徑" + radius + ", 圓心(" + x2 + "," + y2 + ")的圓內");
            }
        } catch (CenterException | InException | OutException e) {
            System.out.println(e.getMessage());
        }
    }
}
public class ex12 {
    public static void main(String args[]){  
        Circle c1=new Circle(5.8, 2.1, 0.2, 9.5);
        c1.check();
    }
}
