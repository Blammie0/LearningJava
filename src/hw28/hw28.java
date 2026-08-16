package hw28;

import java.util.ArrayList;
import java.util.function.Predicate;

class Emp {
    String nam;
    String dep;
    double sal;

    Emp(String nam, String dep, double sal) {
        this.nam = nam;
        this.dep = dep;
        this.sal = sal;
    }
}

public class hw28 {
    public static void prn(Emp e) {
        System.out.println(e.nam + " | " + e.dep + " | " + e.sal);
    }

    public static void flt(ArrayList<Emp> lst, Predicate<Emp> p) {
        for (Emp e : lst) {
            if (p.test(e)) {
                prn(e);
            }
        }
        System.out.println("---");
    }

    public static void main(String[] args) {
        ArrayList<Emp> lst = new ArrayList<>();
        lst.add(new Emp("биба", "оратор", 300));
        lst.add(new Emp("боба", "переворачиватель пингвинов", 150));
        lst.add(new Emp("пипа", "бещработный", 67));
        lst.add(new Emp("пупа", "президент", 500));

        flt(lst, e -> e.dep.equals("плебей") && e.sal > 200);
        flt(lst, e -> e.nam.startsWith("капиталюга") && e.sal != 450);
        flt(lst, e -> e.nam.equals(e.dep));
    }
}