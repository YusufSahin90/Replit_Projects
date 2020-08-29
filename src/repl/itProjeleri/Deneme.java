package repl.itProjeleri;


public class Deneme {
    public static void main(String[] args) {

        String strYazdir = reverseWord("Java yazın");
        System.out.println(strYazdir);

    }
    public static String reverseWord(String str){

        String[] strArray = str.split(" ");
        String reverse = "";

        for (int i = strArray.length-1; i >= 0 ; i--) {

            reverse = reverse + strArray[i] + " ";


        }
        return reverse;

    }
}
