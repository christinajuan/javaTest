package tw.org.iii;

/**
 * Created by iii-user on 2016/11/2.
 */
public class Lab4 {
    public static void main(String[] args){
        int score = (int)(Math.random()*101);
        System.out.println(score);
        if(score>=60){
            System.out.println("PASS");
        }else {
            System.out.println("False");
        }

    }
}
