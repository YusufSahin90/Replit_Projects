package Replit_Arrays;

public class ArrayWithForIt {
    public static void main(String[] args) {
        //Kodu aşağıya yazınız.


        int[] array = {5,6,8,12,14,19};
        int toplam = 0;
        int çıkar = 0;
        for (int i = 0; i < array.length; i++){

            if(array[i] % 2 == 0){

                toplam = toplam + array[i];
            }if(array[i] % 2 == 1){

                çıkar = çıkar - array[i];
            }
        }
        System.out.println(toplam + çıkar);
    }
}
/*
int Array oluşturun ve elemanları : 5,6,8,12,14,19

Eğer sayı çiftse topla, tekse çıkar.

Örneğin:

 -5 + 6 + 8 + 12 + 14 - 19 = 16


Toplamlarını yazdırın.
 */
