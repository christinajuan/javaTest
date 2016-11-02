package tw.org.iii;

/**
 * Created by iii-user on 2016/11/2.
 */
public class Lab18 {
    public static void main(String[] args){
        Brad18 b1 = new Brad18();
        Brad18 b2 = new Brad18();
        System.out.println("Game over");
    }
}
class Brad18 {
    int a;
    //成員>初始質為0
    //區域變數要手動初始化...
    Brad18(){
        a = 12;
        System.out.println("Brad18()");
    }
    //建構式>屬性初始化
}
