package Replit_Collections;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<Integer,String> mp =new HashMap<>();
        mp.put(1,"Lion");
        mp.put(2,"Tiger");
        mp.put(3,"Elephant");
        mp.put(4,"Cat");
        mp.put(5,"Dog");

        System.out.println(map1(mp,5));

    } public static String map1(Map<Integer,String> mp,int num){
        return mp.get(num);
    }

    // 2. yöntem foreach kullanarak böyle çözebiliriz.

//    public static String map1(Map<Integer,String> mp,int num){
//        String str="";
//        for (Map.Entry<Integer,String> ts:mp.entrySet()) {
//            if(ts.getKey()==num) str=ts.getValue();
//        }
//        return str;
//    }
}


