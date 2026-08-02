package hw23;

abstract class Animal {
    String nam;

    Animal(String nam) {
        this.nam = nam;
    }

    abstract void eat();
    abstract void slp();
}

interface Speakable {
    default void spk() {
        System.out.println("Somebody speaks");
    }
}

abstract class Fish extends Animal {
    Fish(String nam) {
        super(nam);
    }

    @Override
    void slp() {
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
    }

    abstract void swm();
}

abstract class Bird extends Animal implements Speakable {
    Bird(String nam) {
        super(nam);
    }

    abstract void fly();

    @Override
    public void spk() {
        System.out.println(nam + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String nam) {
        super(nam);
    }

    abstract void run();
}

class Mechenosec extends Fish {
    Mechenosec(String nam) {
        super(nam);
    }

    @Override
    void swm() {
        System.out.println("месеносес класивая рыба которая быстра плавае");
    }

    @Override
    void eat() {
        System.out.println("месеносес веган, не ест мясо, только корм на миндальном молоке");
    }
}

class Pingvin extends Bird {
    Pingvin(String nam) {
        super(nam);
    }

    @Override
    void eat() {
        System.out.println("пенхвене любя хыбу");
    }

    @Override
    void slp() {
        System.out.println("пенхвене спя обимая друх жрха");
    }

    @Override
    void fly() {
        System.out.println("пенхвене не летат оне жирни");
    }

    @Override
    public void spk() {
        System.out.println("пенхвене не поют оне лохи");
    }
}

class Lev extends Mammal {
    Lev(String nam) {
        super(nam);
    }

    @Override
    void eat() {
        System.out.println("лев мясоед и кушает веганов");
    }

    @Override
    void slp() {
        System.out.println("лев спиь большую часть дня как мы");
    }

    @Override
    void run() {
        System.out.println("лев самая бистра кошка но баста кошка уме быстрей");
    }
}

public class hw23 {
    public static void main(String[] args) {
        Mechenosec mec = new Mechenosec("Месося");
        System.out.println(mec.nam);
        mec.eat();
        mec.slp();
        mec.swm();

        System.out.println("--------------------");

        Speakable png = new Pingvin("Стив");
        png.spk();

        System.out.println("--------------------");

        Animal le1 = new Lev("Лёва");
        System.out.println(le1.nam);
        le1.eat();
        le1.slp();

        System.out.println("--------------------");

        Mammal le2 = new Lev("Аутист");
        System.out.println(le1.nam);
        le2.eat();
        le2.slp();
        le2.run();
        le2.spk();
    }
}