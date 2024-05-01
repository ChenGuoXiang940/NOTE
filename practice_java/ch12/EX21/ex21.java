package EX21;

public class ex21 {
    public static void main(String[] args) {
        String str6 = 
        "Two heads are better than one.";
        System.out.println(str6.substring(
            str6.indexOf("better"), str6.
            indexOf("better") + "better".
            length()));
    }
}
