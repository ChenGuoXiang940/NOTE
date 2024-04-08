package EX14;
class Car{
    String owner="Tom";
    final String color="Red";
    final void show(){
        System.out.println("Owner: "+owner+" Color: "+color);
    }
}
class Truck extends Car{
    Truck(String o,String c){
        owner=o;
        //color=c; 不能修改 final
    }
}
public class ex14 {
    Truck obj = new Truck("Tony","Blue");
    //obj1.show(); 不可調用 final
}
