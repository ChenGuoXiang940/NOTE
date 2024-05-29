package Ex1;
class Ball<T>{
    private T color;
    public void setValue(T value){
        this.color = value;
    }
    public void showValue(){
        System.out.println(this.color);
    }
}
class ex1 {
    public static void main(String[] args) {
        Ball<String> b = new Ball<>();
        b.setValue("Red");
        b.showValue();
        Ball<Integer> b2=new Ball<>();
        b2.setValue(255);
        b2.showValue();
    }
}