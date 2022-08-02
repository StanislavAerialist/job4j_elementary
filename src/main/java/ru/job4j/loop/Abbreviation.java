package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int code = s.codePointAt(i);
            if (code >= 65 && code <= 90) {
                chars[count] = chars[i];
                count++;
            }
        }
        char[] rsl = new char[count];
        for (int i = 0; i < count; i++) {
            rsl[i] = chars[i];
        }
        return String.valueOf(rsl);
    }
}
