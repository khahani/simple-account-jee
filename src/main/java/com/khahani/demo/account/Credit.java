package com.khahani.demo.account;

public class Credit  extends Record{

    @Override
    public int getOperator() {
        return 1;
    }

    @Override
    public String getStatus() {
        return "بستانکار";
    }
}
