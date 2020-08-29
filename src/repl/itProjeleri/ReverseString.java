package repl.itProjeleri;

public class ReverseString {
    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"

Stringi tersten yazdırın ve print edin.

Cevap böyle olmalı :  "dlroW olleH"

         */

//        for(int i = 0; i < str.length; i++){
//            System.out.println(Arrays.toString(str));
//
//        }


//        String str = "    Hello      World      selam    ";
//        // replaceAll("[ ]+", " ") ise arada ne kadar boşluk olursa olsun
//        // tek boşluga dusuruyor ve aralara tek boşluk atıyor
//        // trim() sagındaki ve solundaki boşlukları siliyor.

//        str = str.trim().replaceAll("[ ]+"," ");
//        String[] arr = str.split("");


        String str = "Hello World";
        String[] kelime = str.split("");  // kelime olarak tersten yazar. WorldHello gibi
//        String[] kelime = str.split(" ");     // cumle olarak tersten yazar. dlroW olleH



        for(int i = kelime.length -1; i >= 0 ; i--) {

            System.out.print(kelime[i]);

        }
    }
}


