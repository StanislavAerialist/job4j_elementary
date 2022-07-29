package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
    if (num % prizes.length != 0) {
        num = num % prizes.length - 1;
    }    else if (num % prizes.length == 0) {
        num = prizes.length - 1;
    }
    return prizes[num];
    }
}