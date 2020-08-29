package repl.itProjeleri;

import java.util.Scanner;

public class ReverseStringMethodluCozumu {
    public static void main(String[] args) {
// Kodu aşağıya yazınız..
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        //reverseStr1(textDuzenle(str));
        System.out.println(textDuzenle(str));
        System.out.println(reverseStr(str));

    }

    public static String textDuzenle(String str) {
        String strNew = "";
        strNew = str.trim().replaceAll("[ ]+", " ");
        return strNew;
    }

    public static String reverseStr(String str) {
        str = textDuzenle(str);
        String stRet = "";
        for (int i = 0; i < str.length(); i++) {
            //stRet +=  str.substring(str.length()-1-i, str.length()-i );
            stRet += str.charAt(str.length() - 1 - i);
        }
        return stRet;
    }


    public static void reverseStr1(String str) {

        String[] cumle = str.split("");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(cumle[i]);
        }
    }
}