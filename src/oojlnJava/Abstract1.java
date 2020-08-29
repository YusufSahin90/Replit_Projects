package oojlnJava;

abstract class Cats {
    public void walk() {
        System.out.println("Cat is walking");
    }
    public abstract void talk();
}
class Tigers extends Cats {
    public void talk() {
        System.out.println("Tiger is talking");
    }
}
class Lions extends Cats {
    public void talk() {
        System.out.println("Lion is talking");
    }
}
class HomeCat extends Cats {
    public void talk() {
        System.out.println("Home Cat is talking");
    }

}
class Abstract1 {
    public static void main(String[] args) {
        Tigers myTiger = new Tigers();
        myTiger.talk();
        myTiger.walk();
        Lions myLions = new Lions();
        myLions.talk();
        myLions.walk();
        HomeCat myHomeCat = new HomeCat();
        myHomeCat.talk();
        myHomeCat.walk();

    }
}
