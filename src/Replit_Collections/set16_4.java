package Replit_Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class set16_4 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs =new LinkedHashSet<>(List.of("Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil"));
        String str1= "Turkey";
        String str2 = "USA";
        System.out.println(removing(lhs,str1,str2));
    }
    public static LinkedHashSet<String> removing(LinkedHashSet<String> lhs, String str1, String str2){
        Iterator kahve=lhs.iterator();
        while(kahve.hasNext()){
            String str= (String) kahve.next();
            if (str==str1) kahve.remove();
            if (str==str2) kahve.remove();
        }
        return lhs;

        // 2. yöntem olarak removing methodunun içinde bu kullanılabilir.

//        lhs.removeAll(Arrays.asList(s1,s2));
//        return lhs;
    }
}
/*
removing() isminde bir method oluşturun.


Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.


Eğer Stringler LinkedHashset 'in içinde varsa, sil.



Return tipi linkedhashset


Örneğin,
linkedhashset : Germany , France , USA , Canada , Mexico , Brazil



String 1= Germany

String 2 = USA

 Germany ve USA 'i sil.

Set'i döndür.
 */
