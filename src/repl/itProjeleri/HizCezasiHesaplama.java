package repl.itProjeleri;

import java.util.Scanner;

public class HizCezasiHesaplama {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

        System.out.print("Hızınız saatte kaç km ? : ");
            int currentSpeed = scan.nextInt();

        System.out.print("Ehliyetiniz var mı ? (Örnek: true(evet) - false(hayır) ): ");
            boolean isDriverLicenceAvailable= scan.nextBoolean();


        /*
        Trafik cezasının değerini hesaplayın.

45 hız sınırıdır.

Eğer hızınız 55-74 arasında ise:

Ceza 100 $'dır.

Eğer hızınız 75 - 84 arasında ise:

Ceza 150 $'dır.

Eğer hızınız 85 -94 arasında ise:

Ceza 320 $'dır.

Eğer hızınız 94'den daha fazla ise:

Ceza 500 $'dır.

ve ayrıca,

Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

         */


        if (currentSpeed > 55 && currentSpeed < 74 && isDriverLicenceAvailable == true)
            System.out.println("cezanız 100 $ dır.");

        else if (currentSpeed > 55 && currentSpeed < 74 && isDriverLicenceAvailable == false)
            System.out.println("cezanız 300 $ dır.");

        else if (currentSpeed > 75 && currentSpeed < 84 && isDriverLicenceAvailable == true)
            System.out.println("cezanız 150 $ dır.");

        else if (currentSpeed > 75 && currentSpeed < 84 && isDriverLicenceAvailable == false)
            System.out.println("cezanız 350 $ dır.");

        else if (currentSpeed > 85 && currentSpeed < 94 && isDriverLicenceAvailable == true)
            System.out.println("cezanız 320 $ dır.");

        else if (currentSpeed > 85 && currentSpeed < 94 && isDriverLicenceAvailable == false)
            System.out.println("cezanız 500 $ dır.");

        else if (currentSpeed > 94 && isDriverLicenceAvailable == true)
            System.out.println("cezanız 500 $ dır.");

        else
            System.out.println("cezanız 700 $ dır.");




}


}
