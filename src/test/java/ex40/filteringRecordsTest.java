package ex40;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class filteringRecordsTest {

    @Test
    void searchFoundFirstName() {
        filteringRecords test = new filteringRecords();

        ArrayList<HashMap<String, String>> listMaps = new ArrayList<>();
        HashMap<String, String> employee = new HashMap<>();
        employee.put("First Name", "John");
        listMaps.add(employee);

        assertEquals(true, test.searchFoundFirstName(0, "John", listMaps));
    }

    @Test
    void searchFoundLastName() {
        filteringRecords test = new filteringRecords();

        ArrayList<HashMap<String, String>> listMaps = new ArrayList<>();
        HashMap<String, String> employee = new HashMap<>();
        employee.put("Last Name", "Johnson");
        listMaps.add(employee);

        assertEquals(true, test.searchFoundLastName(0, "John", listMaps));
    }
}