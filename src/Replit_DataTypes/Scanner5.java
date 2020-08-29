package Replit_DataTypes;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen şehir ismi giriniz : ");
        String sehir = scanner.nextLine();
        System.out.println("10 sene önce yaşadığınız şehir : " + sehir);
    }
}

/*
Bir String oluştur.

Konsol'a 10 sene önceki yaşadığın şehri yazın.

Bu String'i yazdırın.
 */
