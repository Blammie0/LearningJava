package hw10;

public class Car {
    String color;
    String engine;
    int doors;

    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }

}

class CarTest{
    static void doorkolvo(Car popa, int kolvo){
        popa.doors = kolvo;
    }

    static void colorchange(Car popa, Car boba){
        String biba = popa.color;
        popa.color = boba.color;
        boba.color = biba;
    }
}

class Main{
    public static void main(String[] args) {
        Car popa = new Car("серобуромалиновый", "ПОПА", 4);
        Car biba = new Car("сикесэвэн", "биба", 5);

        CarTest.colorchange(popa, biba);
        CarTest.doorkolvo(popa, 5);

        System.out.println(popa.color + "    " + biba.color);
        System.out.println(popa.doors);


    }
}