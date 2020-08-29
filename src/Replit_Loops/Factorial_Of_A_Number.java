package Replit_Loops;

import java.util.Scanner;

public class Factorial_Of_A_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int useIntAsMax = scan.nextInt();

        //Kodu aşağıya yazınız.

        int faktöriyel = 1;

        for(int i = 1; i <= useIntAsMax; i++){
            faktöriyel = faktöriyel * i;


        }
        System.out.println(faktöriyel);

    }
}
/*
Scanner ile yazılan herhangi bir sayının faktöriyelini hesaplayabilecek bir kod yazınız.



Örnek:

Sayı:4
faktöriyel: 1*2*3*4=24

Sayı:5
faktöriyel: 1*2*3*4*5=120
 */