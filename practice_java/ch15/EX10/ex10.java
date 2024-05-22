package EX10;
class Animal implements Runnable{
    private String id;
    public Animal(String str){
        id=str;
    }
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(id+"來了"+i+"次");
        }
    }
}
public class ex10 {
    public static void main(String[] args) {
        Animal Tom=new Animal("狸克");
        Animal Redd=new Animal("狐利");
        Animal Tortimer=new Animal("壽伯");
        Animal Blathers=new Animal("傅達");
        Thread threadA = new Thread(Tom);
        Thread threadB = new Thread(Redd);
        Thread threadC = new Thread(Tortimer);
        Thread threadD = new Thread(Blathers);
        try{
            threadA.start();
            threadA.join();
            threadC.start();
            threadC.join();
            threadD.start();
            threadD.join();
            threadB.start();
            threadB.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
