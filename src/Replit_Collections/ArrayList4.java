package Replit_Collections;

import java.util.ArrayList;

public class ArrayList4 {
    public static ArrayList<String> changelnArraylist(ArrayList<String> arraylist, String s1, String s2){
        for (int i = 0; i <arraylist.size() ; i++) {
            if (s1.equals(arraylist.get(i))) arraylist.set(i, s2);
        }
        return arraylist;
    }
}
/*
İsmi changelnArraylist() olan bir method oluşturun.


Parametre olarak String ArrayList, String s1, String s2

   Arraylist'te s1'i s2 olarak değiştirin


Return String arrayList


Örneğin;
Arraylist  "yellow" , "red" , "blue" , "red" , "blue"

s1 = blue

s2 = yellow

Tüm blue 'ları yellow'a dönüştürün.

cevap: "yellow" , "red" , "yellow" , "red" , "yellow"

 */