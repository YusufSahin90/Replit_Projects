package Replit_DataTypes;

import java.util.Scanner;

public class Scanner8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ağırlık giriniz (kg cinsinden) : ");
        byte kg = scanner.nextByte();

        System.out.println("Ağırlık : " + kg + " kg'dır.");

    }
}

/*
Bir byte oluşturunuz.


Konsola kg cinsinden bir ağırlık yazınız.


Byte'ı yazdırınız.
 */
