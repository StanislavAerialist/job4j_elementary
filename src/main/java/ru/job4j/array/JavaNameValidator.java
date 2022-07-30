package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl = false;
        for (int i = 0; i < name.length(); i++) {
            int codeOfFirst = name.codePointAt(0);
            int code = name.codePointAt(i);
            if (((code >= 48 && code <= 57) || code == 36 || code == 95 || (code >= 97 && code <= 122)) && (codeOfFirst >= 97 && codeOfFirst <= 122)) {
                rsl = true;
            }   else {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}