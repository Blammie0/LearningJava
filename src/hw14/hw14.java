package hw14;

public class hw14 {
    public void emeil(String biba) {
        String[] boba = biba.split(";");

        for (String pipa : boba) {
            pipa = pipa.trim();

            if (!pipa.isEmpty()) {
                int popa = pipa.indexOf('@');
                int domEnd = pipa.indexOf('.', popa);

                if (popa != -1 && domEnd != -1) {
                    String servName = pipa.substring(popa + 1, domEnd);
                    System.out.println(servName);
                }
            }
        }
    }

    public static void main(String[] args) {
        hw14 parser = new hw14();
        String popa = "biba@yahoo.com; boba@mail.ru; dva@gmail.com;";
        parser.emeil(popa);
    }
}