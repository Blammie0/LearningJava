package hw18;

import java.util.ArrayList;
import java.util.TreeSet;

public class hw18 {

    public static ArrayList<String> abc(String... str) {
        TreeSet<String> set = new TreeSet<>();

        for (String s : str) {
            set.add(s);
        }

        ArrayList<String> res = new ArrayList<>(set);
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        abc("попа", "пипа", "боба", "биба", "попа", "биба");
    }
}