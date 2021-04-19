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

    @Ignore
    @Test
    public void add_record(){
        Record r = new Record();
        r.setAmount(1000);
        account.addRecord(r);
//        account.getRemain()
    }
}