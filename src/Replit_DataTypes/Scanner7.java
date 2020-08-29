package Replit_DataTypes;

import java.util.Scanner;

public class Scanner7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir banka hesabınız var mı ? : ");
        boolean banka = scanner.nextBoolean();

        System.out.println(banka);

    }
}

/*
Bir boolean oluşturunuz.

Konsola "Bir Banka Hesabınız Var mı ? " yazınız.

Varsa True , yoksa False olarak  konsoldan cevap veriniz.

Boolean'ı yazdırınız.
 */
