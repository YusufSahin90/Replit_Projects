package Replit_Collections;

import java.util.HashSet;
import java.util.List;

public class set13_1 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>(List.of(4,2,3,1,7,6,8,9,4,34,4534));
        System.out.println(totalCount(hs));
    }

    public static int totalCount(HashSet<Integer> hs)
    {
        return hs.size();
    }
}
/*
Create a method totalCount()

totalCount() isminde bir method oluşturun.

Parametresi  'Integer Hashset' olmalı




HashSetteki eleman sayısını alın.

totalCount'u döndürün.

Örnek:

hashset ; 4,2,3,1,7

cevap: 5
 */
