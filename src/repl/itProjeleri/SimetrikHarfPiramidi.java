package repl.itProjeleri;

public class SimetrikHarfPiramidi {
    public static void main(String[] args) {

/*  n=5 için  Simetrik harf Piramidi
                    A
                   ABA
                  ABCBA
                 ABCDCBA
                ABCDEDCBA
         */
        int n = 5;

        for (int i = 1; i <= n; i++) {           // n tane satır yazdırılıyor

            // n-i kadar yanyana bosluk yazdırılıyor
            // satırlarda sırası ile  (n-ı) yani 4, 3, 2, 1 bosluk
            // burada k<10-i deseydık, n=5 olduğundan şekli 5 birim daha sağa kaydırmış olurduk.
            for (int k = 0; k < n - i; k++) System.out.print(" ");

            // j satır sayısına bağlı olarak tek sayıda print yapıyor.
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j <= i)                       // if statement i den küçük kontrolü
                    System.out.print((char) (j + 64));        // j<i   -->  i:3 ise 123 gibi artan
                else
                    System.out.print((char) (i - j % i + 64));    // j>i --> i:3 ise 21 gibi azalan
            }
            System.out.println();   // her satırdan sonra alt satıra geçiliyor

        }
    }
}
