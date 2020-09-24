package com.algorithms.creational.fluent.app;

import com.algorithms.creational.fluent.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer.Builder(
                new CPF("12345678910"))
                .withInvoiceAddress("Rua XYZ")
                .withName("Felipe")
                .withBirthDate(LocalDate.now())
                .build();
        Product product = new Product.Builder(
                new Barcode("ASD59121AD5S"))
                .withCode(1151465L)
                .withTitle("Sample Product")
                .withDescription("Lorem ipsum")
                .build();
        Invoice invoice = new Invoice(customer, product, LocalDate.now());

        System.out.println(invoice.toString());

    }
}
