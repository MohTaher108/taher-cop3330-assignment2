package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordValidationTest {

    @Test
    void passwordValidator() {
        passwordValidation test = new passwordValidation();
        assertEquals(0, test.passwordValidator("12345"));
        assertEquals(1, test.passwordValidator("abcdef"));
        assertEquals(2, test.passwordValidator("abc123xyz"));
        assertEquals(3, test.passwordValidator("1337h@xor"));
    }
}