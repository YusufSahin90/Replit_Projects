package Replit_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2 {
    public  static int getSum(ArrayList<Integer> arraylist){
        int toplam=0;
        for (int i = 0; i < arraylist.size(); i++) {
            toplam+=arraylist.get(i);
        }
        return toplam;
    }
    public static void main(String[] args) {

        ArrayList<Integer> sayilar = new ArrayList<>(List.of(1,2,3,4,5));

        System.out.println("getSum(sayilar) : " + getSum(sayilar));

        // 2. yöntem
//        ArrayList<Integer> sayilarToplam = new ArrayList<>();
//
//        sayilarToplam.add(1);
//        sayilarToplam.add(2);
//        sayilarToplam.add(3);
//        sayilarToplam.add(4);
//        sayilarToplam.add(5);
//
//        System.out.println(getSum(sayilarToplam));


        // 3. yöntem listeleme
//
//        ArrayList<Integer> sayilarToplam = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
//
//        System.out.println(getSum(sayilarToplam));

    }

}
/*
getSum() isminde bir method oluşturun.

Parametresi ArrayList olmalı


Return tipi int olmalı.


ArrayList teki tüm sayıları birbiri ile toplayın.



return olarak toplam sonucu döndürün.

Örneğin;

Arraylist = 1,2,3,4,5

return 15 olmalı
 */
