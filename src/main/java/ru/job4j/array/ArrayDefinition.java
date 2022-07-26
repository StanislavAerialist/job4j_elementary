package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {

        String[] names = new String[4];
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        names[0] = "Stas Korobeinikov";
        names[1] = "Mikhail Lukonin";
        names[2] = "Petr Arsentev";
        names[3] = "Elena Kartashova";

        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i]);
        }

        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
    }
}
