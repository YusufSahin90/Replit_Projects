package Replit_IfElseStatement;

import java.util.Scanner;

public class SchoolGrade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quizScore =scan.nextInt();
        int midTermScore =scan.nextInt();
        int finalScore =scan.nextInt();

        // Kodu aşağıya yazınız ve yukarıdaki kodlara dokunmayınız.

        int ortalama = (quizScore + midTermScore + finalScore) / 3;

        if (ortalama >= 90)
            System.out.println("Your grade is A");
        else if (ortalama >= 70 && ortalama <= 90)
            System.out.println("Your grade is B");
        else if (ortalama >= 50 && ortalama <= 70)
            System.out.println("Your grade is C");
        else if (ortalama < 50)
            System.out.println("Your grade is F");
    }
}
/*
Bir öğrencinin notunu belirleyen bir Java programı yazın.

Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

Eğer ortalama not >=90% =>not=A
Eğer ortalama not >= 70% ve<90% => not=B
Eğer ortalama not >=50% ve <70% =>not=C
Eğer ortalama not <50% =>note=F

Aşağıdaki örnek çıktıya bakın:

int Quiz_score: 80
int mid_term_score: 68
int Final_score: 90
print (Your grade is B)
          (Notunuz B'dir)
 */