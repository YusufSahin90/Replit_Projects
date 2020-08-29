package Replit_Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Map3 {
    public static void main(String[] args) {
        HashMap<String,Integer> mp =new HashMap<>();
        mp.put("Lion",1);
        mp.put("Tiger",2);
        mp.put("Elephant",3);
        mp.put("Cat",4);
        mp.put("Dog",5);

        System.out.println(returnValue(mp));

    } public static ArrayList<Integer> returnValue(HashMap<String,Integer> hm){
        ArrayList<Integer> arraylist=new ArrayList<>(hm.values());
        return arraylist;
    }


    // 2. yöntem foreach ile

//    public static ArrayList<Integer> returnValue(HashMap<String,Integer> hm){
//        ArrayList<Integer> arraylist=new ArrayList<>();
//        for (Integer ky:hm.values())
//        {
//            arraylist.add(ky);
//        }
//
//        return arraylist;
//    }
}
