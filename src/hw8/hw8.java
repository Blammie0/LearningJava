package hw8;

class Popa {
    int pipa;

    public Popa() {
        pipa = 67;
    }
}

public class hw8 {
    public static void main(String[] args) {

        Popa Opa = new Popa();
        System.out.println("попа1 создана");
        Popa Ipa = new Popa();
        System.out.println("попа2 создана");

        for (int i = 0; i < 6; i++) {
            new Popa();
            System.out.println("попа" + (i+3) + " создана");
        }
    }

}
