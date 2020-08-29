package Replit_Collections;

import java.util.HashSet;
import java.util.List;

public class set14_2 {
    public static void main(String[] args) {
        HashSet<String> hs =new HashSet<>(List.of("banana" , "strawberry" , "kiwi" , "pineapple"));
        String str1="kiwi";
        String str2="peach";
        System.out.println(changeSet(hs,str1,str2));
    }
    public static HashSet<String > changeSet(HashSet<String> hs, String str1, String str2){

        if(hs.contains(str1)) {

            hs.remove(str1);
            hs.add(str2);
        }
        return hs;
    }
}
/*
changeSet() isminde bir method oluşturun.

Parametre olarak bir String HashSet   ve  iki String

return hashset olmalı

Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.





ÖRNEK:
hashset = "banana" , "strawberry" , "kiwi" , "pineapple"

String 1 = banana

String 2 = peach

CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
 */
