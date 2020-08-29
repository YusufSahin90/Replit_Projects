package repl.itProjeleri;

public class SimetrikSayiPramidi {
    public static void main(String[] args) {

          /*  n=5 için    Simetrik Sayı Piramidi
                    1
                   121
                  12321
                 1234321
                123454321
         */
        int n = 5;
        for (int i = 1; i <= n; i++) {           // n tane satır yazdırılıyor

            int boslukSayisi = n - i;     // n-i kadar yanyana bosluk yazdırılıyor,  (n-ı) yani 4, 3, 2, 1 bosluk
            int rakamSayisi = 2 * i - 1;    // her satırda kaç rakam yazdırılacak

            // bosluklar yazdırılıyor
            for (int k = 0; k < boslukSayisi; k++) System.out.print(" ");

            // satırlarda yazdırılacak rakamlar yazdırılıyor
            for (int j = 1; j <= rakamSayisi; j++) {
                // burada satır sayısının yarısına kadar artan sonra azalan sırada rakam yazdırmak için if
                if (j <= i)                       // if statement i den küçük kontrolü
                    System.out.print(j);        // j<i   -->  i:3 ise 123 gibi artan
                else
                    System.out.print(i - j % i);    // j>i --> i:3 ise 21 gibi azalan
            }
            System.out.println();   // her satırdan sonra alt satıra geçiliyor
        }
    }
}
