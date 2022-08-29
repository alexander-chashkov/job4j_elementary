package ru.job4j.pojo;

import java.util.Date;

/**
 * @author alex_chashkov
 * @created 29/08/2022 - 21:16
 * @project job4j
 */
public class Student {
    private String fullName;
    private String group;
    private Date dateOfReceipt;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(Date dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }
}
