package EX17;
class Truck{
    protected String name="Toyota";
}
public class ex17 {
    public static void main(String[] args) {
        Truck t1=new Truck();
        System.out.println(t1.getClass());
    }
}