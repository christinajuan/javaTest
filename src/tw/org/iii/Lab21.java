package tw.org.iii;

public class Lab21 {
    public static void main(String[] args){
        String s1 = "Christ";
        String s2 = new String();
        byte[] b1 = {97,98,99,100};
        String s3 = new String(b1);
        String s4 = new String(b1,1,2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
