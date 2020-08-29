package Replit_Arrays;

public class Array2D {
    public static void main(String[] args) {
        //Kodu aşağıya yazınız.

        int[][] array = { {2,3,2} , {4,1,5} , {7,2,5} };


        for (int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(Integer.toString(array[i][j]).replaceAll("2","6"));
            }
            System.out.println();
        }



    }
}
/*
Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]

Bütün 2'leri 6'yla değiştirin.

Array'i yazdırınız.
 */
