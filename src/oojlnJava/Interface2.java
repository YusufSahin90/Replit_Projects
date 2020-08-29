package oojlnJava;

import java.util.ArrayList;
import java.util.Scanner;

interface deliveryOptions {

    int AmazonMinFreeDelivery = 10000;
    int CostcoMinFreeDelivery = 15000;

    int getTheTotal(ArrayList<String> a);

    String isFreeShipping(ArrayList<String> b);

}

class Amazon implements deliveryOptions {
    public int getTheTotal(ArrayList<String> a) {

        int sum = 0;
        for (String i : a) {
            if (i.contains("K")) {
                i = i.replaceAll("\\D", "").trim();

                sum += Integer.parseInt(i) * 1000;
            } else {
                i = i.replaceAll("\\D", "").trim();
                sum += Integer.parseInt(i);
            }
        }
        return sum;

    }

    public String isFreeShipping(ArrayList<String> b)  {
        int sum;
        sum=getTheTotal( b);
        if (sum >= AmazonMinFreeDelivery) {
            System.out.println("you are eligible for free delivery");
            return "you are eligible for free delivery";
        } else {
            System.out.println("you need to buy " + (AmazonMinFreeDelivery - sum) + " amount of item.");

            return "you need to buy " + (AmazonMinFreeDelivery - sum) + " amount of item.";
        }

    }

}
class Costco implements deliveryOptions{
    public int getTheTotal(ArrayList<String> a) {

        int sum = 0;
        for (String i : a) {
            if (i.contains("K")) {
                i = i.replaceAll("\\D", "").trim();

                sum += Integer.parseInt(i) * 1000;
            } else {
                i = i.replaceAll("\\D", "");
                sum += Integer.parseInt(i);
            }
        }
        return sum;

    }
    public String isFreeShipping(ArrayList<String> b)  {
        int sum;
        sum=getTheTotal( b);

        if (sum >= CostcoMinFreeDelivery) {
            System.out.println("you are eligible for free delivery");
            return "you are eligible for free delivery";
        } else {
            System.out.println("you need to buy " + (CostcoMinFreeDelivery - sum) + " amount of item.");

            return "you need to buy " + (CostcoMinFreeDelivery - sum) + " amount of item.";
        }

    }


}

class Main {

    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        ArrayList<String> listNumbers = new ArrayList<>();

        int counter = 0;
        while (dp.hasNext()) {

            listNumbers.add(dp.nextLine());
            counter++;
            if (counter == 10) {

                break;
            }
        }

        // while calling the methods in the classes use listNumbers arraylist

        Amazon amaz=new Amazon();
        Costco kostko=new Costco();
        amaz.isFreeShipping(listNumbers);
        kostko.isFreeShipping(listNumbers);


    }

}
