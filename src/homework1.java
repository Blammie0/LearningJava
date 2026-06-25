public class homework1 {
    public static void main(String[] args) {

        byte a0 = 12;
        byte a1 = 0xC;
        byte a2 = 014;
        byte a3 = 0b1100;

        System.out.println("\nбайты:    " + a0 + ", " + a1 + ", " + a2 + ", " + a3);

        short b0 = 1300;
        short b1 = 0x514;
        short b2 = 02424;
        short b3 = 0b0101_0001_0100;

        System.out.println("шорты:    " + b0 + ", " + b1 + ", " + b2 + ", " + b3);

        int c0 = 0;
        int c1 = 0x0;
        int c2 = 00;
        int c3 = 0b0;

        System.out.println("инты:     " + c0 + ", " + c1 + ", " + c2 + ", " + c3);

        long d0 = 12345678L;
        long d1 = 0x75BCD15L;
        long d2 = 0726746425L;
        long d3 = 0b0111_0101_1011_1100_1101_0001_0101;

        System.out.println("лонги:    " + d0 + ", " + d1 + ", " + d2 + ", " + d3);

        float f0 = 67.0F;
        float f1 = 14.88F;
        System.out.println("флоаты:   " + f0 + ", " + f1);

        double i0 = 228.0;
        double i1 = 7.0;
        System.out.println("даблы:    " + i0 + ", " + i1);

        boolean e0 = true;
        boolean e1 = false;
        System.out.println("буулианы: " + e0 + ", " + e1);

        char j0 = 'o';
        char j1 = 123;
        char j2 = '\u1234';
        System.out.println("чары:     " + j0 + ", " + j1 + ", " + j2);




    }
}
