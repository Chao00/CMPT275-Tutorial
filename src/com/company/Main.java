package com.company;

import com.company.model.Product;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hi");
        Product product = new Product("phone");
        System.out.println(product.getName());
    }
}
