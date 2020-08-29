/*
nstructions from your teacher:
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

import java.util.Scanner;

public class encapsulation1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String n1 = scan.nextLine();

        int i1 = scan.nextInt();

        //BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        student ogrenci1 = new student();

        ogrenci1.setName(n1);
        ogrenci1.setAge(i1);


        System.out.println(ogrenci1.getName());
        System.out.println(ogrenci1.getAge());



        }
}



class student{

    private String name;
    private int age;


    public String getName(){

        return "Student name is " + name;
    }
    public void setName(String name){

        this.name = name;
    }
    public String getAge(){

        return "He is " + age + " years old";
    }
    public void setAge(int age){

        this.age = age;
    }

}
