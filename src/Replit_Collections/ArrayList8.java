package Replit_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList8 {
    public static int secondMax(ArrayList<Integer> arraylist)
    {
        int enb=arraylist.get(0);
        int enb2=arraylist.get(0);
        for (int i = 0; i <arraylist.size() ; i++) {
            if (arraylist.get(i)>enb && arraylist.get(i)>enb2)
                enb2=enb;
            enb=arraylist.get(i);
            if (arraylist.get(i)<enb && arraylist.get(i)>enb2)
                enb2=arraylist.get(i);

        }
        return enb2;
    }
    public static void main(String[] args){

        ArrayList<Integer> max2 = new ArrayList<>(List.of(5,3,4,6,7));

        System.out.println(secondMax(max2));
    }
}
/*
secondMax()  isminde bir method oluşturun.

Parametre olarak integer ArrayList.

Return tipi int olmalı.




ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün



ÖRN;

ArrayList   --  5,3,4,6,7

CEVAP : 6
 */
