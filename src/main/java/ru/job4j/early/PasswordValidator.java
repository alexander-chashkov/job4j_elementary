package ru.job4j.early;

import java.util.Arrays;
import java.util.List;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Пустой пароль.");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Пароль слишком короткий/длинный.");
        }
        if (!isUpperAnyLetter(password)) {
            throw new IllegalArgumentException("Пароль должен содержать хотя бы один символ в верхнем регистре.");
        }
        if (!isLowerAnyLetter(password)) {
            throw new IllegalArgumentException("Пароль должен содержать хотя бы один символ в нижнем регистре.");
        }
        if (!isDigitAnyLetter(password)) {
            throw new IllegalArgumentException("Пароль должен содержать хотя бы одну цифру.");
        }
        if (!isSpecialAnyLetter(password)) {
            throw new IllegalArgumentException("Пароль должен содержать хотя бы один спец. символ (не цифра и не буква).");
        }
        if (isContainsListAnyLetter(password)) {
            throw new IllegalArgumentException("Пароль не должен содержать следующий подстроки: qwerty, 12345, password, admin, user.");
        }
        return password;
    }

    private static boolean isLowerAnyLetter(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isUpperAnyLetter(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDigitAnyLetter(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSpecialAnyLetter(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isContainsListAnyLetter(String str) {
        List<String> lstWords = Arrays.asList("qwerty", "12345", "password", "admin", "user");
        return lstWords.stream().anyMatch(word -> str.toUpperCase().contains(word.toUpperCase()));
    }

}

