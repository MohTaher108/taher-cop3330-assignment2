package ex37;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class passwordGeneratorTest {

    @Test
    void makePassword() {
        passwordGenerator test = new passwordGenerator();

        ArrayList<Character> password = test.makePassword(8, 2, 2);

        assertEquals(8, password.size());
    }
}