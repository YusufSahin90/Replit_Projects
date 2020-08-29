package oojlnJava;

/*
Burada iki adet class vardır. Biri Main, diğeri ise student ,



student classı içinde;

String name(isim) ve int age(yaş) isminde variables(değişkenler) oluşturunuz.

getter ve setter ( alıcı ve ayarlayıcı ) oluşturunuz.



Main classın içinde;

Örnek:

age 12'dir.
name Steven'dır.

name(isim) olarak;
"Student name is Steven"

ve

age(yaş) olarak da;
"He is 12 years old"
 */

import java.util.*;

public class Encapsulation1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String n1 = scan.nextLine();

        int i1 = scan.nextInt();

        //BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        student yeni=new student();
        yeni.setName(n1);
        yeni.setAge(i1);

        System.out.println(yeni.getName());
        System.out.println(yeni.getAge());
    }
}

class student {
    private String name;
    private int age;

    public String getName() {

        return "Student name is "+name;
    }

    public void setName(String newName) {

        this.name =  newName;
    }

    public String getAge() {

        return "He is "+age+" years old";
    }

    public void setAge(int newAge) {

        this.age= newAge;
    }

}
