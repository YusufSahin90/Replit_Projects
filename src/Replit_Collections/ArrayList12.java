package Replit_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList12 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist=new ArrayList<>(List.of(1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28));
        int num1=20;
        int num2=30;
        System.out.println(rangeBtw(arraylist,num1,num2));
    }
    public static int rangeBtw(ArrayList<Integer> arraylist, int num1, int num2)
    {
        int sayac=0;
        for (int i = 0; i <arraylist.size() ; i++) {
            if(arraylist.get(i)>=num1 && arraylist.get(i)<=num2) sayac++;
        }
        return sayac;
    }
}
/*
rangeBtw() isminde bir method oluşturun.

Parametre olarak   bir Arraylist  ve iki ayrı int

return tipi int


 Arraylist'in iki int arasında kaç değeri olduğunu sayın.

return  count       (sayacı (count) döndürün.)


Example (Örnek):

ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28

min = 20

max = 30

return =  5    (20,22,25,28,30)

min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
 */
