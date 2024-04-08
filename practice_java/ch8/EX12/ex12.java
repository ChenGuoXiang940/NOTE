package EX12;
class CData{
    private String name;	// 姓名
    private String email;	// 電子郵件信箱
    private int mm;    		// 生日的月
    private int dd; 		// 生日的日
    private int yy; 		// 生日的年
    void setName(String n){
        this.name=n;
    }
    void setEmail(String e){
        this.email=e;
    }
    void setBirthday(int m,int d,int y){
        this.mm=m;
        this.dd=d;
        this.yy=y;
    }
    private int[]days={31,28,31,30,31,30,31,31,30,31,30};
    private boolean checkDate(int m,int d,int y){
        if(y<1900||y>2099)return false;
        if(m<1||m>12)return false;
        if(d<1||d>days[m-1])return false;
        return true;
    }
    void setAll(String n,String e,int m,int d,int y){
        setName(n);
        setEmail(e);
        setBirthday(m, d, y);
    }
    void showData(){
        String birthday = String.format("%02d/%02d/%04d", mm, dd, yy);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        if(checkDate(mm, dd, yy))System.out.println("Birthday: " + birthday);
        else System.out.println("日期格式設定錯誤!");
    }
}

public class ex12 {
    public static void main(String[] args) {
        CData friend=new CData();
        friend.setAll("Tom","abc@gmail.com",6,18,2006);
        friend.showData();
        CData mary=new CData();
        mary.setAll("Mary", "def@gmail.com", 30, 2, 2004);
        mary.showData();
    }
}
