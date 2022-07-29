package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int cLeft = 0;
        int cRight = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (cLeft < left.length && cRight < right.length) {
                if (left[cLeft] < right[cRight]) {
                    rsl[i] = left[cLeft];
                    cLeft++;
                }   else {
                    rsl[i] = right[cRight];
                    cRight++;
                }
            } else if (cLeft < left.length) {
                rsl[i] = left[cLeft];
                cLeft++;
            } else {
             rsl[i] = right[cRight];
             cRight++;
            }
        }
        return rsl;
    }
}