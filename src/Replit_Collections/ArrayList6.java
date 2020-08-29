package Replit_Collections;

import java.util.ArrayList;

public class ArrayList6 {
    public static ArrayList<Integer> common_values(ArrayList<Integer> araylist1, ArrayList<Integer> araylist2){
        ArrayList<Integer> yeni=new ArrayList<>();
        for (int i = 0; i <araylist1.size() ; i++) {
            for (int j = 0; j <araylist2.size(); j++) {
                if(araylist1.get(i)==araylist2.get(j)) yeni.add(araylist1.get(i));
            }

        }
        return yeni;
    }
}
