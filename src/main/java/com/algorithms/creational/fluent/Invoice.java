package com.algorithms.creational.fluent;

import java.time.LocalDate;

public class Invoice {


    private Customer customer;
    private Product product;
    private LocalDate emittedDate;


    public Invoice(Customer customer, Product product, LocalDate emittedDate) {
        this.customer = customer;
        this.product = product;
        this.emittedDate = emittedDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getEmittedDate() {
        return emittedDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Invoice{");
        sb.append("customer=").append(customer);
        sb.append(", product=").append(product);
        sb.append(", emittedDate=").append(emittedDate);
        sb.append('}');
        return sb.toString();
    }
}
