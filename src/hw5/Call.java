package hw5;

public class Call {


    int sum() {
        int popa = 0;
        System.out.println("ссума щищел в колисесве  нуля  щук: " + popa);
        return popa;
    }
    int sum (int a) {
        int popa = a;
        System.out.println("ссума щищел в колисесве  одне  щук: " + popa);
        return popa;
    }
    int sum (int a, int b) {
        int popa = a + b;
        System.out.println("ссума щищел в колисесве  деве  щук: " + popa);
        return popa;
    }
    int sum (int a, int b, int c) {
        int popa = a + b + c;
        System.out.println("ссума щищел в колисесве  трие  щук: " + popa);
        return popa;
    }
    int sum (int a, int b, int c, int d) {
        int popa = a + b + c + d;
        System.out.println("сcума щищел в колисесве чичири щук: " + popa);
        return popa;
    }
}

class Main {
    public static void main(String[] args) {

        Call call = new Call();

        call.sum();
        call.sum(3);
        call.sum(3, 5);
        call.sum(4, 5, 6);
        call.sum(4, 5, 6, 7);



    }
}