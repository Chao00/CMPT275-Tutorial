package com.company.test;

import com.company.model.Product;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class ProductTest {
    private Product product;

    @Before
    public void setUp() {
        product = new Product("iphone");
    }

    @Test
    public void testConstructor() {
        assertEquals("iphone", product.getName());
    }

    @Test
    public void testSetter() {
        String testName = "iphone 11";
        product.setName(testName);
        assertEquals(testName, product.getName());
    }

    @Test
    public void testAppendStringToName() {
        product.appendStringToName("12");
        assertEquals("iphone12", product.getName());
    }

    @Test
    public void testAppendString() {
        product.appendStringToName("12");
        assertEquals("iphone12", product.getName());
    }
}