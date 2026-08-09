package hw26;

class Nem extends RuntimeException {
    public Nem(String msg) {
        super(msg);
    }
}

class Nev extends Exception {
    public Nev(String msg) {
        super(msg);
    }
}

class Tig {
    public void eat(String str) {
        if (!"мьс".equals(str)) {
            throw new Nem("тгр н ст " + str);
        }
        System.out.println("тгр ст мьс");
    }

    public void drk(String str) throws Nev {
        if (!"вд".equals(str)) {
            throw new Nev("тгр н пьт " + str);
        }
        System.out.println("тгр пьт вд");
    }
}

public class hw26 {
    public static void main(String[] arg) {
        Tig tig = new Tig();

        tig.eat("мьс");

        try {
            tig.drk("vвд");

            try {
                tig.drk("пиво");
            } catch (Nev err) {
                System.out.println(err.getMessage());
            } catch (Exception err) {
                System.out.println(err.getMessage());
            } finally {
                System.out.println("иннер файнали блок");
            }

        } catch (RuntimeException err) {
            System.out.println(err.getMessage());
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
}