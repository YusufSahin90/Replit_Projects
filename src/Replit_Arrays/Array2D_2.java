package Replit_Arrays;

public class Array2D_2 {
    public static void main(String[] args) {
        //Kodu aşağıya yazınız.

        int[][] array = {{5,2,1},{10,2,3,6},{1,2}};

        int toplam = 0;
        for(int satir = 0; satir < array.length; satir++){

            for (int sutun = 0; sutun < array[satir].length; sutun++){

                toplam = toplam + array[satir][sutun];

            }

        }
        System.out.println(toplam);




    }
}
/*
Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]

2D array'de olan elemanları toplayınız.

toplamı yazdırınız.

Sonuç 32 olmalıdır.
 */
