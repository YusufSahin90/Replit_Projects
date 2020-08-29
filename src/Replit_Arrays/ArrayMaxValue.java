package Replit_Arrays;

public class ArrayMaxValue {
    public static void main(String[] args) {
        // code start here

        int[] array = {12,2,5,15,8};

        int max = array[0];

        for (int i = 0; i < array.length; i++){

            if(array[i] > max){
                max = array[i];
            }

        }
        System.out.println(max);




    }
}
/*
int Array oluşturun ve elemanları : 12,2,5,15,8

En büyük değeri yazdırınız.

 */
