package Replit_Arrays;

public class ArrayContains {
    public static void main(String[] args) {
        //Kodu aşağıya yazınız..

        String[] array = {"Apple","Orange","Banana","Pineapple"};

        for(int i = 0; i < array.length; i++){

            if(array[i].contains("Apple")){

                System.out.println(true);
                break;

            }else{

                System.out.println(false);
            }
        }

    }
}
/*
String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple

Apple elemanının bu Array'a ait olup olmadığını kontrol edin.

Eğer aitse "true" çevirin.

Loops (döngüler) kullanın.
 */
