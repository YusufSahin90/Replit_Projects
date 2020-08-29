package oojlnJava;

import java.util.Scanner;

abstract class Calculator {
    public abstract int calculating(int a, int b);
}

class Sum extends Calculator {
    public int calculating(int a, int b) {
        return a + b;
    }

}

class Divide extends Calculator {
    public int calculating(int a, int b) {
        return a / b;
    }

}

class Multiply extends Calculator{
    public int calculating(int a, int b) {
        return a * b;
    }

}

class Substract extends Calculator {
    public int calculating(int a, int b) {
        return a - b;
    }

}

class Abstract2 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int a = oku.nextInt();
        int b = oku.nextInt();
        Sum topla = new Sum();
        Substract cikar = new Substract();
        Divide bol = new Divide();
        Multiply carp = new Multiply();
        System.out.println(topla.calculating(a, b));
        System.out.println(bol.calculating(a, b));
        System.out.println(carp.calculating(a, b));
        System.out.println(cikar.calculating(a, b));}


}
