package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean rsl = false;
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] < array[index + 1]) {
                rsl = true;
            }            else {
                rsl = false;
                break;
        }
        }
        return rsl;
    }
}