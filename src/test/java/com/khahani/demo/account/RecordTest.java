package com.khahani.demo.account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordTest {

    private Record r;

    @Test
    public void add_zero_credit(){
        assertWrongAmount(0);
    }

    @Test
    public void add_negative_credit(){
        assertWrongAmount(-1);
    }

    @Test
    public void add_acceptable_amount(){
        assertCorrectAmount(5000);
    }

    private void assertCorrectAmount(int amount) {
        r = new Credit();
        r.setAmount(amount);
        assertEquals(amount, r.getAmount());
    }

    private void assertWrongAmount(int amount) {
        r = new Credit();

        Record.CantEnterZeroAmountException thrown = assertThrows(
                Record.CantEnterZeroAmountException.class,
                ()-> r.setAmount(amount)
        );

        assertTrue(thrown.getMessage().contains("Amount is not valid"));
    }


}