package Replit_Arrays;

public class AverageOfArray {
    public static void main(String[] args) {
        //Kodu aşağıya yazınız..

        int[] array = {12,14,21,23,10,4};

        int toplam = 0;
        for (int i = 0; i < array.length; i++){
            toplam = toplam + array[i];

        }
        System.out.println(toplam / array.length);

    }
}
/*
int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4

Array'in ortalamasını alınız.

 */
