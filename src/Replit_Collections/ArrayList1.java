package Replit_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
    public static int getCount(ArrayList<String> arrlist, String str){
        int sayac=0;
        for (int i = 0; i <arrlist.size() ; i++) {
            if (str.equals(arrlist.get(i))) sayac++;
        }
        return  sayac;
    }
    public static void main(String[] args){

        // 1. yöntem : tek tek meyveler.add("Kiwi") methodu ile eklemek yerine
        // List.of()  methodu ile tek seferde birden çok String tanımlayabiliriz.
        ArrayList<String> meyveler = new ArrayList<>(List.of("Banana","Kiwi","Peach","Banana","Orange","Banana","Ananas","Banana"));

        // 2. yöntem : Arrays.asList() methodu ile de tek seferde ekleyebiliriz.
//        ArrayList<String> meyveler = new ArrayList<>(Arrays.asList("Banana", "Kiwi", "Peach", "Banana", "Orange", "Banana", "Ananas", "Banana"));

        String meyve = "Banana";

        System.out.println(getCount(meyveler,meyve));
    }
}

/*
ismi getCount() olan bir method oluşturun.

Parametre olarak bir String ArayList  ve  bir tane String

Return tipi int olmalı.

ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.

Örneğin;

ArrayList = Orange , Kiwi , Peach , Banana , Orange

String Orange:

Count = 2 olmalı. (Orange 2 kez yazılmış)
*/
