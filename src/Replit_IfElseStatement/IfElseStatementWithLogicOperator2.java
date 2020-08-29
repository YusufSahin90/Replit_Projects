package Replit_IfElseStatement;

public class IfElseStatementWithLogicOperator2 {
    public static void main(String[] args) {
        //Kodu aşağıya yazınız.

        int a = 60;


        if ( a % 9 == 0 && a % 5 == 0)
            System.out.println("Able to divide by 9 and 5");
        else if (a % 4 == 0 && a % 5 == 0)
            System.out.println("Able to divide by 4 and 15");

    }
}
/*
60 değerinde bir int oluşturun.

Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.

Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
 */