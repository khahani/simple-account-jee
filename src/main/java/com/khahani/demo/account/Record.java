package com.khahani.demo.account;

public class Record {
    private int amount;

    public void setAmount(int amount) {
        if (amount <= 0)
            throw new CantEnterZeroAmountException();

        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public static class CantEnterZeroAmountException extends RuntimeException{
        @Override
        public String getMessage() {
            return "Amount is not valid";
        }
    }
}
