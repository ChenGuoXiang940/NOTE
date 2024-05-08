package EX11;
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
public class ex11 {
    public static void main(String args[]){  
        double radius=10.0;
        double x1=5.3;
        double y1=6.8;
        double x2=0.2;
        double y2=9.5;
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
