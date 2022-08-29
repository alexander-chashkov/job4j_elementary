package ru.job4j.pojo;

import java.util.Date;

/**
 * @author alex_chashkov
 * @created 29/08/2022 - 21:20
 * @project job4j
 */
public class College {
    public static void main(String[] args) {
        Student st = new Student();
        st.setGroup("1A");
        st.setFullName("John Ivanovich Ivanov");
        st.setDateOfReceipt(new Date());
        System.out.println("Full name: " + st.getFullName() + " group: " + st.getGroup() + " date of receipt: " + st.getDateOfReceipt());
    }
}
