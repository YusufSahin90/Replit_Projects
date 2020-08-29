package oojlnJava;

/*
Burada iki adet class vardır. Biri Main diğeri ise Employees,


Employees(Çalışanlar) class'ında;

Bu variable'ları oluşturunuz;

private String name,

private int salary,

private String dob (date of birth) (Doğum tarihi)

getter ve setter oluşturunuz.


Main class'ın içinde;

Örnek:
Name is Fernando
Salary is 80000
dob is 11/23/2000

main method'un içinde,

Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.

Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.

Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have a 80000 salary yazdırınız.

ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Encapsulation2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        String dop = scan.nextLine();
        int salary = scan.nextInt();
//  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.
        Employees isci=new Employees();
        isci.setName(name);
        isci.setSalary(salary);
        isci.setDob(dop);
        System.out.println(isci.getYazi());

    }
}

class Employees{
    private String name;

    private int salary;

    private String dob;

    public String getName() {
        return "Name is" + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {

        return "Salary is " + salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return "dob is " + dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getYazi(){

        if(ageCalculator(dob)>18){
            return "Welcome to our company "+name+" your salary is "+salary;
        }
        else if(ageCalculator(dob)<18){
            return "come back when you are 18 years old.";
        }
        else{
            return "we can have inter with you after that you can have a "+salary+" salary";
        }

    }
    public static int ageCalculator(String myDOB){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate today = LocalDate.now();

        String formattedDate = today.format(formatter);
        LocalDate simdi = LocalDate.parse(formattedDate, formatter);

        LocalDate dogumTarihi = LocalDate.parse(myDOB, formatter);
        int yas = simdi.compareTo(dogumTarihi);
        return yas;

    }
}
