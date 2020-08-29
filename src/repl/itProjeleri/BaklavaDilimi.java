package repl.itProjeleri;

public class BaklavaDilimi {
    public static void main(String[] args) {

        /* n=3 için     Baklava Dilimi
         *
         ***
         *****
         ***
         *
         */
        int kenarUzunlugu = 5;
        int yildizSayisi, boslukSayisi;

        for (int i=1; i <= 2*kenarUzunlugu; i++){   // Baklava dilimi olacağı için i 1 den 2xkenarUzunlugu na kadar

            // her satırda yazılacak bosluk adedi. Ternary ile
            boslukSayisi = (i <= kenarUzunlugu) ? kenarUzunlugu - i : i - kenarUzunlugu;

            // her satırda yazılacak yıldız adedi. Ternary ile
            yildizSayisi = (i <= kenarUzunlugu) ? 2 * i - 1 : 2 * (2*kenarUzunlugu-i) - 1;

            // gerekli miktarda bosluk print() ile yazdırılır
            for (int k = 1; k <= boslukSayisi; k++) System.out.print(" ");

            // gerekli miktarda * print() ile yazdırılır
            for (int j = 1; j <= yildizSayisi; j++) System.out.print("*");

            System.out.println();   // bir alt satıra geçilir
        }
    }
}

