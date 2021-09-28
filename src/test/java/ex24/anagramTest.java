package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class anagramTest {

    @Test
    void isAnagram() {
        anagram test = new anagram();
        assertEquals(true, test.isAnagram("word", "wrdo"));
    }
}