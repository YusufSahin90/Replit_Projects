package oojlnJava;
/*
Book class'ı verilmiştir.

İki tane attributes oluşturunuz.

bookName ve authorName (String ile)

Book class'ını kapsülleyin. (Encapsulate)

Main class'ın içine object  oluşturun ve sonucu yazdırınız.


"Book name is BOOKNAME and Author is AUTHORNAME"
 */

import java.util.Scanner;

public class Encapsulation5 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String bookName  = scan.nextLine();
        String authorName = scan.nextLine();



//BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.
        Book kitap =new Book();
        kitap.setBookName(bookName);
        kitap.setAuthorName(authorName);
        System.out.println("Book name is "+bookName+" and Author is "+authorName);




    }
}

class Book{
    private String bookName;
    private String authorName;
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public String getBookName(){
        return bookName;
    }
    public String getAuthorName(){
        return authorName;
    }
}

