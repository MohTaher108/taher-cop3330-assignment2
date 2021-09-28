package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        CreditCard test = new CreditCard();
        assertEquals(70, Math.ceil(test.calculateMonthsUntilPaidOff(5000, 100, (double) 12 / 36500)));
    }
}