package hw16;

import java.util.Arrays;

public class hw16 {

    public int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        hw16 sortir = new hw16();

        int[] arr = {5, 2, 9, 1, 3, 7};

        System.out.println("изначална: " + Arrays.toString(arr));

        int[] sortirarr = sortir.sort(arr);

        System.out.println("атсассирована: " + Arrays.toString(sortirarr));
    }
}