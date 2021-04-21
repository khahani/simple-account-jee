package com.khahani.demo.persist;

import javax.persistence.*;

@Entity
@Table(name = "Record")
public class RecordEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name="day")
    private int day;

    @Column(name="month")
    private int month;

    @Column(name="amount")
    private int amount;

    @Column(name="status")
    private int status;

    @Column(name="description")
    private String description;

    public RecordEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
