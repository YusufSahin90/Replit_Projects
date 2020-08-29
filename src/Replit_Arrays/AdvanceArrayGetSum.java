package Replit_Arrays;

public class AdvanceArrayGetSum {
 public static void main(String[] args) {
    //Kodu aşağıya yazınız.

    String str = "$12 $23 $10 $2 $5 $2";

    String[] kaldir = str.replace("$","").split(" ");


    int toplam = 0;

    for(int i = 0; i < kaldir.length; i++){


        toplam = toplam + Integer.parseInt(kaldir[i].trim());


    }
    System.out.println(toplam);



}
}
/*
Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"

$ işaretlerini kaldırın ve sayıları toplayın.

Sayıların toplamını yazdırın.

 */
