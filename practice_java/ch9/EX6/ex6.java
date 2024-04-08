package EX6;

class Data {
    private static int count = 0;

    public Data() {
        count++;
    }

    public static void setZero() {
        count = 0;
    }

    public static void setValue(int n) {
        count = n;
    }

    public static void show() {
        System.out.println("Count= " + count);
    }
}

public class ex6 {
    public static void main(String[] args) {
        new Data();
        Data.show();
        new Data();
        Data.show();
        Data.setZero();
        Data.setValue(10);
        Data.show();
    }
}
