package repl.itProjeleri;

public class NestedLoop1 {
    public static void main(String[] args) {


        for(int satir = 1; satir <= 5; satir++) {

            for(int bosluk = 5 - satir; bosluk > 0; bosluk--) {
                System.out.print(" ");
            }

            for(int sutun = 1; sutun <= satir; sutun++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
