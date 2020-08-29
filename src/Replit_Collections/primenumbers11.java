package Replit_Collections;

public class primenumbers11 {
    public static void main(String[] args) {
        // code start here

        int n=20;
        int sayac=0;

        for (int i = 2; i <=n ; i++) {

            for (int j = 2; j <i ; j++) {

                if(i%j==0) {   // burada asal olmayan sayıları bulduk.
                    sayac++;
                    break;
                }
            }
        }
        System.out.println(n-sayac-1);  // buldugumuz asal olmayan sayıları, n'den çıkartıp
                                        // asal olanları bulduk.
    }
}
/*
negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.



Örnek 1:
n = 20

cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.


Örnek2:
Input(Girdi): 10
Output(Çıktı): 4
Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
 */
