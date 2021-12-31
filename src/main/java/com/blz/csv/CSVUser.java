package com.blz.csv;

import com.opencsv.bean.CsvBindByName;


public class CSVUser {
    @CsvBindByName
    private String Name;
    @CsvBindByName(column = "Email")
    private String EmailId;
    @CsvBindByName
    private long Phone;
    @CsvBindByName
    private String Country;

    public CSVUser(String name, String emailId, long phone, String country) {
        Name = name;
        EmailId = emailId;
        Phone = phone;
        Country = country;
    }

    public CSVUser(){

    }

    @Override
    public String toString() {
        return "CSVUser{" +
                "Name='" + Name + '\'' +
                ", EmailId='" + EmailId + '\'' +
                ", Phone=" + Phone +
                ", Country='" + Country + '\'' +
                '}';
    }
}
