package EX18;
class Phone{
    String tel;
    String mobile;
}
class NameCard{
    private String name;
    private String address;
    private Phone data;
    NameCard(String n,String a){
        this.name=n;
        this.address=a;
        data=new Phone();
    }
    void setPhone(String te,String mob){
        data.tel=te;
        data.mobile=mob;
    }
    void show(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Tel: "+data.tel);
        System.out.println("Mobile: "+data.mobile);
    }
}
public class ex18 {
    public static void main(String[] args) {
        NameCard tom=new NameCard("Tom","123 City");
        tom.setPhone("345-7612", "0971-666000");
        tom.show();
    }
}
