package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class validatingInputsTest {

    @Test
    void first_filled() {
        validatingInputs test = new validatingInputs();
        assertEquals(false, test.first_filled(""));
        assertEquals(true, test.first_filled("J"));
    }

    @Test
    void first_2char() {
        validatingInputs test = new validatingInputs();
        assertEquals(false, test.first_2char(""));
        assertEquals(true, test.first_2char("Jo"));
    }

    @Test
    void last_filled() {
        validatingInputs test = new validatingInputs();
        assertEquals(false, test.last_filled(""));
        assertEquals(true, test.last_filled("J"));
    }

    @Test
    void last_2char() {
        validatingInputs test = new validatingInputs();
        assertEquals(false, test.last_2char(""));
        assertEquals(true, test.last_2char("Jo"));
    }

    @Test
    void employeeIDFormat() {
        validatingInputs test = new validatingInputs();
        assertEquals(false, test.employeeIDFormat("A12-1234"));
        assertEquals(true, test.employeeIDFormat("TK-4321"));
    }

    @Test
    void zipCheck() {
        validatingInputs test = new validatingInputs();
        assertEquals(false, test.zipCheck("5"));
        assertEquals(true, test.zipCheck("55555"));
    }

    @Test
    void validateInput() {
        validatingInputs test = new validatingInputs();

        String s1, s2, s3, s4, s5, s6;

        s1 = "The first name must be filled in.\n";
        s2 = "The first name must be at least 2 characters long.\n";
        s3 = "The last name must be filled in.\n";
        s4 = "The last name must be at least 2 characters long.\n";
        s5 = "The employee ID must be in the format of AA-1234.\n";
        s6 = "The zipcode must be a 5 digit number.\n";
        String s = s1+s2+s3+s4+s5+s6;

        assertEquals(s, test.validateInput("", "", "", ""));
        assertEquals("There were no errors found.", test.validateInput("John", "Johnson", "TK-4321", "55555"));
    }
}