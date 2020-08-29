package Replit_Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Map2 {
    public static void main(String[] args) {
        HashMap<String,Integer> mp =new HashMap<>();
        mp.put("Lion",1);
        mp.put("Tiger",2);
        mp.put("Elephant",3);
        mp.put("Cat",4);
        mp.put("Dog",5);

        System.out.println(returnKey(mp));

    } public static ArrayList<String> returnKey(HashMap<String,Integer> hm){
        ArrayList<String > arraylist=new ArrayList<>(hm.keySet());
        return arraylist;
    }

    // 2. yöntem for ile


//    public static ArrayList<String> returnKey(HashMap<String,Integer> hm){
//        ArrayList<String > arraylist=new ArrayList<>();
//        for (String ky:hm.keySet())
//        {
//            arraylist.add(ky);
//        }
//        return arraylist;
//    }
}
