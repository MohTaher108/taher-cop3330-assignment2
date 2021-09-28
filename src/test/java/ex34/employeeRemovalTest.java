package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class employeeRemovalTest {

    @Test
    void removeEmployee() {
        employeeRemoval test = new employeeRemoval();

        String[] listOfEmployees = new String[5];
        listOfEmployees[0] = "John Smith";
        listOfEmployees[1] = "Jackie Jackson";
        listOfEmployees[2] = "Chris Jones";
        listOfEmployees[3] = "Amanda Cullen";
        listOfEmployees[4] = "Jeremy Goodwin";

        assertEquals(true, test.removeEmployee(listOfEmployees, "Chris Jones"));
    }
}