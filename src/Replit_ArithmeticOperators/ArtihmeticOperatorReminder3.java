package Replit_ArithmeticOperators;

import java.util.Scanner;

public class ArtihmeticOperatorReminder3 {
    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();

        //Kodu aşağıya yazınız.

        int kalan = num1 % num2;

        System.out.println(kalan);
    }
}

/*
Verilen iki int hakkında,

num1'in num2'ye bölümünden kalanı yazdırınız.
 */
