package Replit_Loops;

public class NestedLoop4 {
    public static void main(String[] args) {
        //Kodu aşağıya yazınız.

        for(int satir=1;satir<=5;satir++)
        {
            for (int bosluk=5-satir;bosluk>0;bosluk--)
            {
                System.out.print(" ");
            }
            for (int sutun=1;sutun<=satir;sutun++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
/*
Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
Sonuç böyle olmalıdır;

       *
      * *
     * * *
    * * * *
   * * * * *

 */