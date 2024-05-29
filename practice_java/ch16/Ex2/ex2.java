package Ex2;
class Circle<T>{
    private T value;
    public void setValue(T value){
        this.value = value;
    }
    public void showValue(){
        if(this.value instanceof String){
            System.out.println("color: "+this.value);
        }
        else if(this.value instanceof Double){
            double r = (double)this.value;
            System.out.printf("area: %.2f\r\n",r*r*Math.PI);
        }
    }
}
public class ex2 {
    public static void main(String[] args) {
        Circle<Double> s1 = new Circle<>();
        s1.setValue(2.0);
        s1.showValue();
        Circle<String> s2 = new Circle<>();
        s2.setValue("Blue");
        s2.showValue();
    }
}
