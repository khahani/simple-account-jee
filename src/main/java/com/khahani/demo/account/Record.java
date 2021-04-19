package com.khahani.demo.account;

public class Record {
    private int amount;
    private int day;
    private int month;
    private String description;
    private Status status;


    public void setAmount(int amount) {
        if (amount <= 0)
            throw new CantEnterZeroAmountException();

        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public static class CantEnterZeroAmountException extends RuntimeException {
        @Override
        public String getMessage() {
            return "Amount is not valid";
        }
    }

    enum Status {
        Debit(-1),
        Credit(1);

        int value;

        Status(int v) {
            value = v;
        }

        int getOperator() {
            return value;
        }

        String getText() {
            if (value == 1)
                return "بستانکار";
            else
                return "بدهکار";
        }
    }
}
