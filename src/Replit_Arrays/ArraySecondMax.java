package Replit_Arrays;

import java.util.Arrays;

public class ArraySecondMax {
    public static void main(String[] args) {
        // Kodu aşağıya yazınız..

        int[] array = {15 , 25, 22, 18, 30};

        int max = array[0];

        for (int i = 0; i < array.length-1; i++){
            Arrays.sort(array);
            if(array[i] > max){
                max = array[i];
            }

        }
        System.out.println(max);




    }
}
/*
int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30

Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
 */
