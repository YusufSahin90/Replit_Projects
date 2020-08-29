package oojlnJava;
/*
Burada iki adet class vardır. Biri Main diğeri ise rentApartments

rentApartments'ın içinde;

Bu variable'ları private olarak oluşturun;

String name

int roomCount

boolean balconyOrNo

Bütün variable'lar için getter ve setter oluşturunuz.



4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)

-----------------------------------------------------------------

Bir method oluşturun;

Eğer room sayısı 0 ise,

rent(kira) 1400

Eğer oda sayısı 1 ise,

rent  1700

Eğer oda sayısı 2 ise,

rent 2200

Eğer oda sayısı 3 ise,

rent 2700

rent'i return'leyin.

----------------------------------------------------------------

Bir method oluşturun.

Eğer balconyOrNo  true ise,

rent'e 200 dollar ekleyin.


Main class'ın içinde;

userName rent is amountOfRent
 */

import java.util.Scanner;

public class Encapsulation4 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int roomCount  = scan.nextInt();
        boolean  balconyOrNo  = scan.nextBoolean();

//  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.
        rentApartments kira=new rentApartments();
        kira.setName(name);
        kira.setRoomCount(roomCount);
        kira.setBalconyOrNo(balconyOrNo);
        System.out.println(kira.getRentApartments());


    }
}

class rentApartments{
    private String name;
    private int roomCount;
    private boolean balconyOrNo;
    public int rent=0;
    public void setName(String name){ this.name=name;}
    public void setRoomCount(int roomCount){this.roomCount=roomCount;}
    public void setBalconyOrNo(boolean balconyOrNo){this.balconyOrNo=balconyOrNo;}



    public int rent(){

        switch(roomCount){
            case 0:
                rent +=1400;
                if(balconyOrNo==true){
                    rent+=200;
                }
                return rent;
            case 1:
                rent +=1700;
                if(balconyOrNo==true){
                    rent+=200;
                }
                return rent;
            case 2:
                rent +=2200;
                if(balconyOrNo==true){
                    rent+=200;
                }
                return rent;
            case 3:
                rent +=2700;
                if(balconyOrNo==true){
                    rent+=200;
                }
                return rent;
            default: return 0;
        }

    }
    public String getRentApartments(){
        rent();
        return name+" rent is "+rent;
    }
}

