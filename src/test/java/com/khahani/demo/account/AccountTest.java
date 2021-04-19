package com.khahani.demo.account;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account = new Account();

    @Test
    public void account_without_record(){
        assertEquals(0, account.getBalance());
    }

    @Test
    public void add_one_credit_record(){
        Record r = new Credit();
        r.setAmount(1000);
        account.addRecord(r);
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void add_two_credit_record(){
        account = new Account();

        Record r = new Credit();
        r.setAmount(1000);
        account.addRecord(r);

        Record r2 = new Credit();
        r2.setAmount(1000);
        account.addRecord(r2);

        assertEquals(2000, account.getBalance());
    }
}