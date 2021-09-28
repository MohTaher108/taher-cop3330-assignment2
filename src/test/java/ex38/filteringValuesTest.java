package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class filteringValuesTest {

    @Test
    void filterEvenNumbers() {
        filteringValues test = new filteringValues();

        int[] numberArray = new int[6];
        for(int i = 0; i < 6; i++) numberArray[i] = i+1;
        int[] evenNumberArray = new int[6];
        evenNumberArray[0] = 2;
        evenNumberArray[1] = 4;
        evenNumberArray[2] = 6;

        numberArray = test.filterEvenNumbers(numberArray);
        for(int i = 3; i < 6; i++) numberArray[i] = 0;

        assertArrayEquals(evenNumberArray, numberArray);
    }
}