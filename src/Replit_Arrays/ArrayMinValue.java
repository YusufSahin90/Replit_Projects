package Replit_Arrays;

public class ArrayMinValue {
    public static void main(String[] args) {
        // Kodu aşağıya yazınız..

        int[] array = {14,19,5,21};

        int min = array[0];

        for (int i = 0; i < array.length; i++){

            if(array[i] < min){
                min = array[i];
            }

        }
        System.out.println(min);




    }
}
/*
int Array oluşturun ve elemanları : 14 , 19 , 5 , 21

En küçük (minimum) sayıyı yazdırınız.
 */
