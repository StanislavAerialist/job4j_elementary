package ru.job4j.loop;

public class DoWhile {
    public static int bingo(int num) {
        int rsl = 0;
        if (num > 0) {
            do {
                rsl += num;
            }
            while (rsl < 300);
        }        else {
            rsl -= 1;
        }
        return rsl;
    }
}
