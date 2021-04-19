package com.khahani.demo.account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account = new Account();

    @Test
    public void account_without_record(){
        assertEquals(0, account.getBalance());
    }

    @Test
    public void when_records_are_balanced_then_balance_is_zero(){
        addRecords("z");
        assertEquals(0, account.getBalance());
    }

    @Test
    public void when_having_more_credit_then_balance_is_positive(){
        addRecords("p");
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void when_having_more_debit_then_balance_is_negative(){
        addRecords("n");
        assertEquals(-1000, account.getBalance());
    }

    /**
     * @param balanceStatus z = zero, p = positive, n = negative
     */
    private void addRecords(String balanceStatus) {
        account = new Account();

        Record d1 = new Debit();
        d1.setAmount(1000);
        account.addRecord(d1);

        Record d2 = new Debit();
        d2.setAmount(1000);
        account.addRecord(d2);

        Record d3 = new Debit();
        d3.setAmount(2000);
        account.addRecord(d3);

        Record c1 = new Credit();
        c1.setAmount(1000);
        account.addRecord(c1);

        Record c2 = new Credit();
        c2.setAmount(1000);
        account.addRecord(c2);

        Record c3 = new Credit();
        c3.setAmount(2000);
        account.addRecord(c3);

        if (balanceStatus.equals("p")){
            Record c4 = new Credit();
            c4.setAmount(1000);
            account.addRecord(c4);
        }

        if (balanceStatus.equals("n")){
            Record d4 = new Debit();
            d4.setAmount(1000);
            account.addRecord(d4);
        }
    }

}