package Replit_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {
    public static ArrayList<Integer> getLength(ArrayList<String> arraylist){
        ArrayList<Integer> uzunluklar=new ArrayList<>();
        for (int i = 0; i <arraylist.size() ; i++) {
            uzunluklar.add(arraylist.get(i).length());
        }
        return uzunluklar;
    }
    public static void main(String[] args) {

        ArrayList<String> uzunluk = new ArrayList<>(List.of("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston","Fas"));

        System.out.println(getLength(uzunluk));
    }
}
/*
getLength() isminde bir method oluşturun.

Parametre olarak String ArrayList

Return tipi Integer ArrayList

ArrayList içindeki her bir Stringin uzunluğunu bulunuz.


Tüm elementlerin uzunluğunu döndürün




Örneğin;

ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"

Tüm Stringlerin uzunluklarını yazdırın;

cevap: 10 ,  8 , 4 , 7 , 6 olmalı
 */
