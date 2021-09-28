package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class addingNumbersTest {

    @Test
    void sumNumbers() {

        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) arr[i] = i+1;

        addingNumbers test = new addingNumbers();
        assertEquals(15, test.sumNumbers(5, arr));
    }
}