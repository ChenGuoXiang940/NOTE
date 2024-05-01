package EX9.subpack1;
public class Sphere {
    public double r;
    public Sphere(double r){
        this.r=r;
    }
    public void show(){
        System.out.println("volume="+ 
        (4.0/3.0)*3.14*r*r*r);
    }
}