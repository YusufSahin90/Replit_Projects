package repl.itProjeleri;

import java.util.ArrayList;


public class Deneme1 {
    public static void main(String[] args) {

        /*
        getSum isminde bir method oluşturun.

Parametresi ArrayList'tir.

Dizideki tüm $ ları kaldır ve tüm sayıları topla

return yaptğımız veri tipi 'int' olmalıdır.

sonuç 0'dan küçükse, -1 yazdırın.



Örnek1:
ArrayList = $13, $15, $20

Cevap = 48 olmalı


Örnek 2 :
ArrayList= $-13, $0, $0

Cevap = -1 olmalı.
         */

        ArrayList<String> sayilar = new ArrayList<>();

        sayilar.add("$13");
        sayilar.add("$15");
        sayilar.add("$20");

        getSum(sayilar);
        System.out.println(getSum(sayilar));


    }
    public static int getSum(ArrayList<String> sayilar){

        int toplam = 0;
        for(String Arr : sayilar){

            toplam = toplam + Integer.parseInt(Arr.replace("$",""));


            }
        return toplam > 0 ? toplam : -1;
        }

    }

