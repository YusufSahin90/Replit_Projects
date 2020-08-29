package repl.itProjeleri;

public class MethodOrnek {
    public static void main(String[] args) {
        /*  0 ile 100 arasinda bir random sayi belirleyiniz
            bu sayinin tersini yazdiriniz. Bu islemi 10 defa tekrar ediniz
        */

            for (int i=0; i<10; i++) {
                int num = randomNum(100);
                System.out.println(num + " " + reverseWord(Integer.toString(num)));
            }

        }

        // 0-max arasi random int sayi secen method
        public static int randomNum(int max){
            return (int)(Math.random()*(max+1));
        }

        // Stringi ters ceviren method
        public static String reverseWord(String str){
            String[] strArr = str.trim().split("");
            String strRev="";

            for (int i=strArr.length-1; i>=0; i--)
                strRev += strArr[i];

            return strRev.trim();

        }
    }

