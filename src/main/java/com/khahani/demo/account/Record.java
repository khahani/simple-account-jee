package com.khahani.demo.account;

public abstract class Record{
    private int amount;
    private int day;
    private int month;
    private String description;
    private long time = System.currentTimeMillis();


    public void setAmount(int amount) {
        if (amount <= 0)
            throw new CantEnterZeroAmountException();

        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public long getTime() {
        return time;
    }

    public void resetTime() {
        time = System.currentTimeMillis();
    }

    public static class CantEnterZeroAmountException extends RuntimeException {
        @Override
        public String getMessage() {
            return "Amount is not valid";
        }
    }

    public abstract int getOperator();
    public abstract String getStatus();

}
