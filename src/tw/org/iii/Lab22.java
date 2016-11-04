package tw.org.iii;

import java.util.Objects;

public class Lab22 {
    public static void main(String[] args){
        String s1 = "Christ";
        String s2 = "Christ";
        String s3 = new String("Christ");
        String s4 = new String("Christ");
        System.out.println(s1 ==s4);
        System.out.println(s3.equals(s4));
        System.out.println("==========");
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        System.out.println("==========");
        String s5 = s3;
        System.out.println(s3.concat("tina")); //保留原來的物件，創新字串
        System.out.println(s3);
        System.out.println("==========");
        System.out.println(p1);

    }
}
class Pen extends Object{
    @Override
    public String toString(){
        return "Apple";
    }

    @Override
    public boolean equals(Object obj){
        return true;
    }
}
