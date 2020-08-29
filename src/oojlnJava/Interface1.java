package oojlnJava;

import java.util.Scanner;

interface Vehicle {
    public int changeGear(int gear);

    public int speedUp(int speed);

    public int applyBrakes(int brake);

}

class Bicycle implements Vehicle {
    public int speed=0;
    public int gear=0;

    public int changeGear(int gear1) {
        this.gear = gear1;
        return gear;
    }

    public int speedUp(int speed1) {
        this.speed += speed1;
        return speed;

    }

    public int applyBrakes( int brake){
        this.speed -= brake;
        return speed;
    }
    public void printAll(){
        System.out.println("current speed is "+speed+" gear count is "+gear);
    }

}

class Car {
    public int speedCar=0;
    public int gearCar=0;

    public int changeGear(int gear1) {
        this.gearCar = gear1;
        return gearCar;
    }

    public int speedUp(int speed1) {
        this.speedCar += speed1;
        return speedCar;

    }

    public int applyBrakes( int brake){
        this.speedCar -= brake;
        return speedCar;
    }
    public void printAll(){
        System.out.println("current speed is "+speedCar+" gear count is "+gearCar);
    }

}

class Interface1 {
    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        int speedIncrease = dp.nextInt();
        int speedDecrease = dp.nextInt();
        int gearForBicycle = dp.nextInt();
        int gearForCar = dp.nextInt();

        // while calling the methods in the classes use these variables

        Bicycle bisiklet=new Bicycle();
        Car araba=new Car();
        bisiklet.applyBrakes(speedDecrease);
        bisiklet.changeGear(gearForBicycle);
        bisiklet.speedUp(speedIncrease);
        bisiklet.printAll();
        araba.applyBrakes(speedDecrease);
        araba.changeGear(gearForCar);
        araba.speedUp(speedIncrease);
        araba.printAll();

    }
}