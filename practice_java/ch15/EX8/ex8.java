package EX8;
class Pig implements Runnable{
    @Override 
    public void run(){
        System.out.println("小豬看到大野狼在爬煙囪\r\n"+
        "就在壁爐上煮了一鍋水");
        for(int i=2;i<=10;i+=2){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i+"分鐘 ");
        }
        System.out.println("\r\n一鍋煮沸的熱水煮好了");

    }
}
class Wolf implements Runnable{
    @Override
    public void run(){
        System.out.println("大野狼對著第三隻小豬的房子吹氣\r\n"+
        "牠不停地吹氣又吹氣\r\n"+
        "還是不能把房子吹倒\r\n"+
        "大野狼非常的生氣\r\n"+
        "牠決定要從煙囪爬進小豬的家裡"
        );
        try{            
            Thread.sleep(10000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        for(int i=3;i<=15;i+=3){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i+"分鐘 ");
        }
        System.out.println("\r\n大野狼爬上煙囪了");
        System.out.println("大野狼從煙囪滑進房子裡");
        System.out.println("就被小豬煮好的水燙死了");
    }
}
public class ex8 {
    public static void main(String[] args) {
        Pig pig = new Pig();
        Wolf wolf = new Wolf();
        Thread threadA = new Thread(pig);
        Thread threadB = new Thread(wolf);
        threadB.start();
        threadA.start();
        try{
            threadB.join();
            threadA.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
