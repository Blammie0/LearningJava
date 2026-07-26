package hw17;

public class hw17 {

    public static String[] abc(String[]... arr) {
        int tot = 0;
        for (String[] sub : arr) {
            tot += sub.length;
        }

        String[] res = new String[tot];

        int ind = 0;
        for (String[] sub : arr) {
            for (String str : sub) {
                res[ind++] = str;
            }
        }

        return res;
    }

    public static void main(String[] arg) {
        String[] ar1 = {"popa", "pipa", "boba", "biba"};
        String[] ar2 = {"sixseven", "sixtynine", "thirtyfour", "onefoureighteight"};

        String[] cmb = abc(ar1, ar2);

        for (String cmd : arg) {
            for (int idx = 0; idx < cmb.length; idx++) {
                if (cmb[idx] != null && cmb[idx].equals(cmd)) {
                    cmb[idx] = null;
                }
            }
        }

        for (String elm : cmb) {
            System.out.println(elm);
        }
    }
}