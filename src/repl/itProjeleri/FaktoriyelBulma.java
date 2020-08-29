package repl.itProjeleri;

import java.util.Scanner;

public class FaktoriyelBulma {
    public static void main(String[] args) {

        // Scanner ile yazılan herhangi bir sayının faktöriyelini hesaplayabilecek bir kod yazınız.

        //  Örnek:
        //
        //Sayı:4
        //faktöriyel: 1*2*3*4=24
        //
        //Sayı:5
        //faktöriyel: 1*2*3*4*5=120

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int useIntAsMax = sc.nextInt();

        int faktöriyel = 1;

        for(int i = 1; i <= useIntAsMax; i++){
            faktöriyel = faktöriyel * i;


        }
        System.out.println("Faktöriyel : " + faktöriyel);

    }
}




