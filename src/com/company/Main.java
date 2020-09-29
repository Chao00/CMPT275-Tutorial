package com.company;

import com.company.model.Product;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hi");
        System.out.println("there");
        System.out.println("there are");
        Product product = new Product("phone");
        System.out.println(product.getName());
    }
}
