/*

Instructions from your teacher:
Burada iki class vardır. Biri Main diğeri ise Subscribe.


Subscribe class'ının içinde;

Bu variables'ları private oluşturunuz.

String name

boolean doYouWanaSubscribe

String whichMember

3 tip memberShip(üyelik) seviyesi vardır. Gold, Silver ve Bronze (Altın, gümüş ve bronz)


Main class'ın içinde;

Örnek;
Name is Victoria, doYouWanaSubscribe true, whichMember Gold

Eğer user(kullanıcı) Gold member(üye) olmak istiyorsa;

Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos , all homework and see you soon. yazdırınız.


Eğer user(kullanıcı) Silver member(üye) olmak istiyorsa;

Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework. yazdırınız.


Eğer user(kullanıcı) Bronze member(üye) olmak istiyorsa;

Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.


Eğer user(kullanıcı) member(üye) olmak istemiyorsa;

See you when you want to be a member. Thanks yazdırınız.




 */


import java.util.*;


public class encapsulation3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String  whichMember = scan.nextLine();
        boolean  doYouWanaSubscribe  = scan.nextBoolean();

//  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.

        Subscribe uye = new Subscribe();

        uye.setName(name);
        uye.setDoYouWanaSubscribe(doYouWanaSubscribe);
        uye.setWhichMember(whichMember);
        System.out.println(uye.uyelik());



    }

}





class Subscribe{

    private String name;
    private boolean doYouWanaSubscribe;
    private String whichMember;

    public void setName(String name) {
        this.name=name;

    }

    public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {
        this.doYouWanaSubscribe = doYouWanaSubscribe;
    }


    public void setWhichMember(String whichMember) {
        this.whichMember = whichMember;
    }
    public String uyelik(){


        if(whichMember.equalsIgnoreCase("Gold") && doYouWanaSubscribe == true){

            return "Welcome to membership " + name + ". Your membership is 40 dollar for month you can enjoy the videos , all homework and see you soon";

        }else if(whichMember.equalsIgnoreCase("Silver") && doYouWanaSubscribe == true){

            return "Welcome to membership " + name + ". Your membership is 20 dollar for month you can enjoy the videos and all homework";

        }else if(whichMember.equalsIgnoreCase("Bronze") && doYouWanaSubscribe == true){

            return "Welcome to membership " + name + ". Your membership is 10 dollar for month you can enjoy the videos";

        }else{

            return "See you " + name + " when you want to be a member. Thanks";
        }

    }
}
