package tw.org.iii;

import java.util.HashMap;

public class Lad50 {
    public static void main(String[] args){
        HashMap<String,Object> map = new HashMap<>();
        map.put("name","Christ");
        map.put("gender",false);
        map.put("weight",42);

        System.out.println(map.get("name"));
        System.out.println(map.get("weight"));

    }
}
