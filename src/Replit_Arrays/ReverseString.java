package Replit_Arrays;

public class ReverseString {
    public static void main(String[] args) {
        // Kodu aşağıya yazınız..

        String str = "Hello World";
        String[] kelime = str.split("");

        for(int i = kelime.length -1; i >= 0; i--){

            System.out.print(kelime[i]);

        }

    }

}
/*
Bir String oluşturun : "Hello World"

Stringi tersten yazdırın ve print edin.

Cevap böyle olmalı :  "dlroW olleH"
 */
