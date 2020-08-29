package Replit_Arrays;

public class Array2D_3 {
    public static void main(String[] args) {
        //Kodu aşağıya yazınız.

        String[][] array = {  {"new jersey","atlanta","ohio"} ,
                {"Pittsburgh" ,"ohio","new york","ohio"} ,
                {"ohio","new york"}  };


        for(int i = 0; i < array.length; i++){

            for (int j = 0; j < array[i].length ; j++){

                String cevir = array[i][j].replaceAll("ohio","Florida");

                System.out.print(cevir + " ");
            }
            System.out.println();
        }



    }
}
/*
Aşağıdaki gibi olan bir 2D String Array oluşturunuz.

[{"new jersey","atlanta","ohio"} ,
{"Pittsburgh" ,"ohio","new york","ohio"} ,
{"ohio","new york"}]

Bütün ohio'ları Florida'yla değiştiriniz.

Array'i yazdırınız.

 */

