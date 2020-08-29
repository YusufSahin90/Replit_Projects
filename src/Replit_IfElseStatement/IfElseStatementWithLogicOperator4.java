package Replit_IfElseStatement;

import java.util.Scanner;

public class IfElseStatementWithLogicOperator4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String number  = scan.nextLine();


        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (number.contains("€"))
            System.out.println("This is euro");
        else if (number.contains("$"))
            System.out.println("This is dollar");
        else
            System.out.println("no money");

    }
}
/*
String number oluşturulmuştur.

Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.

Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.

Aksi halde (else) "no money" yazdırın.
 */