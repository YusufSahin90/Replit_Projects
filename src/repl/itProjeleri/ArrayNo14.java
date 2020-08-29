package repl.itProjeleri;

import java.util.*;

public class ArrayNo14 {
 public static void main(String[] args) {
    // code start here   
   
    Scanner scan = new Scanner(System.in);
     System.out.print("Sayı giriniz(Örnek: 1 2 3 4 5 6) :");
    String str1 = scan.nextLine();
    
    String[] arr1 = str1.split(" ");
    
    int[] intArr = new int[arr1.length];
    
    int count = 0;
    
    for(int i = 0 ; i < intArr.length ; i++){
      
      int i1 = Integer.parseInt(arr1[i]);
      
      intArr[count] =i1; 
      
      count++;
    }
    
    //Kod buradan başlıyor.. Yukarısını değiştirmeyiniz..
    // intArr ı kullanın.
    
    boolean var1 = false;
        boolean var4 = false;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i]==1) var1 = true;
            if (intArr[i]==4) var4 = true;
        }
        // if (var1 == true && var4 == true)     // ya da bu şekilde kullanabiliriz.
        if (var1 && var4)
             System.out.println(false);
        else
             System.out.println(true);
    }
  }