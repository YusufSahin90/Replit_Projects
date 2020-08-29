package Replit_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_6 {
    public static void main(String[] args) {

        ArrayList<Integer> arraylist=new ArrayList<>(List.of(5,4,6,2,1));

        System.out.println(hillNum(arraylist));
    }
    public static int hillNum(ArrayList<Integer> arraylist){
        int aranansayi=0;
        for (int i = 1; i <arraylist.size()-1 ; i++) {
            if (arraylist.get(i)<arraylist.get(i-1) && arraylist.get(i)>arraylist.get(i+1))  aranansayi=arraylist.get(i);
        }
        return aranansayi;
    }
}
/*
hillNum() isminde bir method oluşturun.

Parametre olarak Integer ArrayList

Return tipi int,

Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.

Örneğin;

ArrayList  5,4,6,2,1

2, 6'dan küçük ve 1 den büyüktür.

Return 2 olmalı.
 */
