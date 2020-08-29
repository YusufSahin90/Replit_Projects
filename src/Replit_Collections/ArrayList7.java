package Replit_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList7 {
    public static void main(String[] args) {

        ArrayList<Integer> arraylist=new ArrayList<>(List.of(5,3,40,6,70));
        System.out.println(secondMax(arraylist));
    }
    public static int secondMax(ArrayList<Integer> arraylist)
    {
        Collections.sort(arraylist);
        return  arraylist.get(arraylist.size()-2);
    }
}
