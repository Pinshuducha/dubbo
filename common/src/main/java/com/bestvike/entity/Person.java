package com.bestvike.entity;

import com.bestvike.utils.ConverterJson;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 7167283503666464503L;
    private String name;
    private String mobileNum;
    private String address;

    public Person() {
    }

    public Person(String name, String mobileNum, String address) {
        this.name = name;
        this.mobileNum = mobileNum;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return ConverterJson.serialize(this);
    }
}
