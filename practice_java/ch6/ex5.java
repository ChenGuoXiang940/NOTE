public class ex5 {
    public static void main(String[]args){
        char chr[]={'H','e','l','l','o'};
        for(int i=0;i<chr.length;i++){
            if(chr[i]>='a'&&chr[i]<='z'){
                chr[i]=(char)('A'+(chr[i]-'a'));
            }
        }
        System.out.println("陣列元素的值:"+java.util.Arrays.toString(chr));
    }
}
