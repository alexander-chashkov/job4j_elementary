package ru.job4j.early;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void whenPswdNullValidate() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate(null);
                });
        assertThat(exception.getMessage()).isEqualTo("Пустой пароль.");
    }

    @Test
    void whenPswdShortOrLongValidate() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("Sup123");
                });
        assertThat(exception.getMessage()).isEqualTo("Пароль слишком короткий/длинный.");
    }

    @Test
    void whenAnyUpperLetValidate() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("super123");
                });
        assertThat(exception.getMessage()).isEqualTo("Пароль должен содержать хотя бы один символ в верхнем регистре.");
    }

    @Test
    void whenAnyLowerLetValidate() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("SUPER123");
                });
        assertThat(exception.getMessage()).isEqualTo("Пароль должен содержать хотя бы один символ в нижнем регистре.");
    }

    @Test
    void whenAnyDigitLetValidate() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("SUPERTrue");
                });
        assertThat(exception.getMessage()).isEqualTo("Пароль должен содержать хотя бы одну цифру.");
    }

    @Test
    void whenAnySpecLetValidate() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("SUPERTrue123");
                });
        assertThat(exception.getMessage()).isEqualTo("Пароль должен содержать хотя бы один спец. символ (не цифра и не буква).");
    }

    @Test
    void whenAnySimpleWordsValidate() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("SUPERTruAdMine123!");
                });
        assertThat(exception.getMessage()).isEqualTo("Пароль не должен содержать следующий подстроки: qwerty, 12345, password, admin, user.");
    }

    @Test
    void whenPswdValidValidate() {
        String pswd = PasswordValidator.validate("SUPERTruAdMe123!");
        assertThat(pswd).isEqualTo("SUPERTruAdMe123!");
    }
}