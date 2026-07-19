package hw15;

public class hw15 {

    public static boolean poop(StringBuilder a, StringBuilder b) {
        return a.toString().equals(b.toString());
    }
}

class A {
    public static void main(String[] args) {

        StringBuilder popa = new StringBuilder("попа");
        StringBuilder pipa = new StringBuilder("попа");
        StringBuilder boba = new StringBuilder("боба");

        System.out.println(hw15.poop(popa, pipa));
        System.out.println(hw15.poop(popa, boba));

    }
}
