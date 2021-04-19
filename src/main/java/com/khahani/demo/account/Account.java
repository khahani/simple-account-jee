package com.khahani.demo.account;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

public class Account {
    private ConcurrentSkipListSet<Record> records;

    public Account() {
        records = new ConcurrentSkipListSet<>(new RecordComparator());
    }

    public void addRecord(Record r) {
        if (!records.add(r)) {
            try {
                Thread.sleep(1);
                r.resetTime();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!records.add(r))
                throw new IllegalArgumentException("Duplicate Record");
        }
    }

    public int getBalance() {
        int balance = 0;

        if (records.size() == 0) {
            return balance;
        }

        for (Record r : records) {
            balance += r.getAmount() * r.getOperator();
        }

        return balance;
    }
}
