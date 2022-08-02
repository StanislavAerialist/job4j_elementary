package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        boolean rsl = false;
        String line = String.valueOf(i);
        for (int index = 0; index < line.length() / 2; index++) {
            rsl = line.charAt(index) == line.charAt(line.length() - 1 - index);
            if (!rsl) {
                break;
            }
        }
        return rsl;
    }
}