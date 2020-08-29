package Replit_IfElseStatement;

import java.util.Scanner;

public class IfElseStatementFindMin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i1 = scan.nextInt();

        int i2 = scan.nextInt();

        int i3 = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (i1 <= i2 && i1 <= i3)
            System.out.println(i1);
        else if (i2 <= i1 && i2 <= i3)
            System.out.println(i2);
        else
            System.out.println(i3);
    }
}
/*
Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.

Bu numarayı yazdırınız.



Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

Örn: 10-11-12 > 10

 */