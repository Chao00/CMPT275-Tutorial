package com.company.model;

public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appendStringToName(String s) {
        setName(getName() + s);
    }

}
