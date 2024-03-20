package practice_java.ch8;
class Cddd{
    String name;
    double height,weight;
    Cddd(String name,double height,double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
    double BMI(){
        return weight/(height*height);
    }
}
public class ex3 {
    public static void main(String[] args) {
        Cddd student=new Cddd("Sandy", 
        1.655, 58.2);
        System.out.println(student.BMI());
    }
}
