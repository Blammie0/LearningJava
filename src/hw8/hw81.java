package hw8;

class hw81 {
    int a = 1;
    static int b = 2;

    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(hw81.b);
    }
}

class hw82 {
    public static void main(final String[] args) {
        hw81 pop = new hw81();
        pop.abc(4);


    }
}
