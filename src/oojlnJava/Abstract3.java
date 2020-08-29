package oojlnJava;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Phone{
    static ArrayList<String> cart=new ArrayList<String>();

    public abstract void options(String a,String b);

    public static int getSum(ArrayList<String> cart){
        int sum=0;
        for(String a:cart){
            a=a.replaceAll("\\D","");
            sum+=Integer.parseInt(a);
        }
        return sum;
    }
}

class Apple extends Phone{
    public  void options(String a,String b){
        if(a.toLowerCase().equals("64 gb")&&b.toLowerCase().equals("5.5 inch")){
            cart.add("$750");
        }else if(a.toLowerCase().equals("64 gb")&&b.toLowerCase().equals("6.5 inch")){
            cart.add("$850");
        }else if(a.toLowerCase().equals("128 gb")&&b.toLowerCase().equals("5.5 inch")){
            cart.add("$950");
        }else if(a.toLowerCase().equals("128 gb")&&b.toLowerCase().equals("6.5 inch")){
            cart.add("$1200");
        }


    }

}

class Samsung extends Phone{
    public  void options(String a,String b){
        if(a.toLowerCase().equals("256 gb")&&b.toLowerCase().equals("5.5 inch")){
            cart.add("$1000");
        }else if(a.toLowerCase().equals("256 gb")&&b.toLowerCase().equals("7.5 inch")){
            cart.add("$1200");
        }else if(a.toLowerCase().equals("512 gb")&&b.toLowerCase().equals("5.5 inch")){
            cart.add("$1300");
        }else if(a.toLowerCase().equals("512 gb")&&b.toLowerCase().equals("6.5 inch")){
            cart.add("$1400");
        }


    }


}


class Abstract3 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        String str1=oku.nextLine();
        String str2=oku.nextLine();
        String str3=oku.nextLine();
        String str4=oku.nextLine();
        Samsung galaksi=new Samsung();
        galaksi.options(str3,str4);
        Apple ayfon=new Apple();
        ayfon.options(str1,str2);
        System.out.println(Phone.getSum(Phone.cart));


    }

}
