package Replit_ArithmeticOperators;

import java.util.Scanner;

public class ArtihmeticOperatorReminder2 {
    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();

        //Kodu aşağıya yazınız.

        int kalan = num1 % num2;
        int sonuc = kalan;

        System.out.println(kalan);
    }
}

/*
Verilen int ler hakkında (num1 ve num2),

num1'in num2'ye bölümünden kalanı int sonuc'a eşitleyiniz.

int sonuc'u yazdırınız.
 */
