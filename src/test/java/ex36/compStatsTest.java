package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class compStatsTest {


    @Test
    void average() {
        compStats test = new compStats();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        assertEquals(400.0, test.average(numbers));
    }


    @Test
    void min() {
        compStats test = new compStats();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        assertEquals(100, test.min(numbers));
    }

    @Test
    void max() {
        compStats test = new compStats();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        assertEquals(1000, test.max(numbers));
    }

    @Test
    void std() {
        compStats test = new compStats();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        String testString = String.format("%.2f", test.std(numbers));

        assertEquals("353.55", testString);
    }
}