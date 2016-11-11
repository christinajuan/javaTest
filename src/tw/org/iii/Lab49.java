package tw.org.iii;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Lab49 {
    public static void main(String[] args){
//        HashSet set = new HashSet();
//        while (set.size()<6){
//            set.add((int)(Math.random()*49+1));
//        }
        TreeSet set = new TreeSet();
        while (set.size()<6){
            set.add((int)(Math.random()*49+1));
        }
        System.out.println(set.toString());
        System.out.println("-----------");
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(0,2);
        list.add(0,3);
        list.add(0,4);
        list.add(0,5);
        System.out.println(list.toString());

        HashSet<Integer> set1 = new HashSet();
        set1.add(12);
        set1.add(34);
    }
}
