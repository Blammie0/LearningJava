package hw25;

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

public class hw25 {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Месося");
        Animal a2 = new Pingvin("Стив");
        Animal a3 = new Lev("Лёва");
        Speakable s1 = new Pingvin("Пинго");
        Speakable s2 = new Lev("Аутист");

        Animal[] arr1 = {a1, a2, a3, (Animal) s1, (Animal) s2};
        Speakable[] arr2 = {s1, s2, (Speakable) a2, (Speakable) a3};

        for (Animal anm : arr1) {
            if (anm instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) anm;
                System.out.println(m.nam);
                m.eat();
                m.slp();
                m.swm();
            } else if (anm instanceof Pingvin) {
                Pingvin p = (Pingvin) anm;
                System.out.println(p.nam);
                p.eat();
                p.slp();
                p.fly();
                p.spk();
            } else if (anm instanceof Lev) {
                Lev l = (Lev) anm;
                System.out.println(l.nam);
                l.eat();
                l.slp();
                l.run();
                l.spk();
            }
            System.out.println("--------------------");
        }

        for (Speakable spk : arr2) {
            if (spk instanceof Pingvin) {
                Pingvin p = (Pingvin) spk;
                System.out.println(p.nam);
                p.eat();
                p.slp();
                p.fly();
                p.spk();
            } else if (spk instanceof Lev) {
                Lev l = (Lev) spk;
                // ОШИБКА: Опечатка в ссылке (выводит имя объекта a3 вместо l.nam)
                System.out.println(a3.nam);
                l.eat();
                l.slp();
                l.run();
                l.spk();
            }
            System.out.println("--------------------");
        }
    }
}