package Replit_IfElseStatement;

import java.util.Scanner;

public class IfElseStatementWithLogicOperator3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str  = scan.nextLine();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (str.isEmpty() == false && str.length() == 14 && str.contains("i love java"))
            System.out.println("String is i love java and 14 character");
        else if (str.isEmpty() == false && str.equalsIgnoreCase("i love java"))
            System.out.println("String is I love java");
    }
}
/*
Eğer String null (0) değilse ve String uzunluğu 14 ise ve String "i love java" yı kapsıyorsa
"String is i love java and 14 character." yazdırınız.

Eğer String null(0) değilse ve karakter biçimini (büyük, kücük harf) görmezden gelirse,
"String is I love java" yazdırın.

 */