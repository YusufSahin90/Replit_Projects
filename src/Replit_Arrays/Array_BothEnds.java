package Replit_Arrays;

import java.util.Arrays;

public class Array_BothEnds {
    public static void main(String[] args) {
        //Kodu aşağıya yazınız..


        int[] array = {1,2,3,4};


        int[] array2 = {array[0], array[array.length -1]};

        System.out.println(Arrays.toString(array2));

    }
}

/*
Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array) ilk ve son elementlerini kapsayan yeni array'e return edin.

 Oluşturacağınız int array'i =   ([1, 2, 3, 4])

Sonuç bu şekilde olmalıdır. [1, 4]
 */

