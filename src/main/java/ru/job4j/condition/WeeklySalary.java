package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] > 8 && i >= 5) {
                sum = sum + 160 + (hours[i] % 8) * 30;
            } else if (i >= 5) {
                sum = sum + hours[i] * 20;
            } else if (hours[i] > 8) {
                sum = sum + 80 + (hours[i] % 8) * 15;
            } else {
                sum = sum + hours[i] * 10;
            }
        }
        return sum;
    }
}