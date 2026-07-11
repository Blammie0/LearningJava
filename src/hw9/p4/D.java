package hw9.p4;

import hw9.p1.A;
import hw9.p1.p2.p3.C;
import hw9.p4.p5.E;

import static hw9.p1.p2.B.statBo;
import static hw9.p1.p2.B.statBa;

public class D {
    public static void main(String[] args) {
        A a = new A();
        a.metA();

        C c = new C();
        c.metC();

        E e = new E();
        e.metE();

        int value = statBo;
        statBa();
    }
}