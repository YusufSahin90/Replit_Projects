package Replit_Collections;

import java.util.HashMap;

public class Map4 {
    public static void main(String[] args) {
        HashMap<Integer,String> mp =new HashMap<>();
        mp.put(1, "New jersey");
        mp.put(2, "New York");
        mp.put(3, "London");
        mp.put(4, "Paris");

        System.out.println(update(mp,2,"istanbul"));

    }
    public static HashMap<Integer,String> update(HashMap<Integer,String> hm, Integer num, String str){
        if (hm.containsKey(num)) hm.put(num,str);
        return hm;
    }

}
