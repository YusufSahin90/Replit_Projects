package Replit_IfElseStatement;

import java.util.Scanner;

public class IfElseIfStatement5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double number  = scan.nextDouble();

        double number2  = scan.nextDouble();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (number > number2)
            System.out.println(" \"Hello World\" ");
        else if (number < number2)
            System.out.println(" \"Not Hello World\" ");
        else
            System.out.println(" \"I love java\" ");
    }
}
/*
90.25 ve 90.25 değerinde iki double oluşturun.

Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.

Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.

Aksi halde (else) "I love java" yazdırın.
 */