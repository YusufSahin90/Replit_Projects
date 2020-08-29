package Replit_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_7 {
    public static void main(String[] args) {
        ArrayList<Integer> araylist1=new ArrayList<>(List.of(3,2,5,6));

        ArrayList<Integer> araylist2=new ArrayList<>(List.of(5,8,9));

        System.out.println(common_values(araylist1,araylist2));
    }
    public static ArrayList<Integer> common_values(ArrayList<Integer> araylist1, ArrayList<Integer> araylist2){

        araylist1.retainAll(araylist2);

        return araylist1;
    }
}
/*
common_values() isminde bir method oluşturun.

Parametre olarak 2 tane Integer ArrayList

Return tipi integer ArrayList olmalı






 İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün

Örneğin;

ArrayList 1:    3 , 2 , 5 , 6

ArrayList 2:     5 , 8 , 9

return  5 olmalı


Örneğin;

ArrayList 1: 8,7,9,6,7

ArrayList 2: 6,7,12,3,1

return 6 ve 7 olmalı
 */
