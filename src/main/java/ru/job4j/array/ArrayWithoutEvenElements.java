package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int size = 0;
        int[] rsl = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 1) {
                rsl[size] = data[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}