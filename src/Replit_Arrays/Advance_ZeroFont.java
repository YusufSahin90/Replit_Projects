package Replit_Arrays;

import java.util.Arrays;

public class Advance_ZeroFont {
    public static void main(String[] args) {
        // Kodu aşağıya yazınız..

        int[] array = {1,0,0,1,0};

        for(int i = 0; i < array.length; i++){

            Arrays.sort(array);
            System.out.println(array[i]);
        }


    }
}
/*
Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması için yeniden düzenlenmiş bir Array döndürün.

 Sıfır olmayan sayıların sırası önemli değildir.

 Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.


Bu şekilde bir Array oluşturunuz: 1,0,0,1,0

Sonuç böyle olmalı :  0,0,0,1,1
 */
