package com.khahani.demo.account;

import java.util.concurrent.ConcurrentSkipListSet;

public class Account {
    private ConcurrentSkipListSet<Record> records;

    public Account() {
        records = new ConcurrentSkipListSet<>(new RecordComparator());
    }

    public void addRecord(Record r) {
        records.add(r);
    }

    public int getBalance() {
        if (records.size() == 0)
            return 0;

        return records.first().getAmount();
    }
}
