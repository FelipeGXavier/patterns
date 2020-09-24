package com.algorithms.creational.fluent;

import java.time.LocalDate;

public class Customer {

    private CPF cpf;
    private String name;
    private LocalDate birthDate;
    private String invoiceAddress;

    public CPF getCpf() {
        return cpf;
    }

    private void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    private void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("cpf=").append(cpf);
        sb.append(", name='").append(name).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append(", invoiceAddress='").append(invoiceAddress).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class Builder{

        private Customer customer = new Customer();

        public Builder(CPF cpf){
            this.customer.setCpf(cpf);
        }

        public Builder withName(String name){
            this.customer.setName(name);
            return this;
        }

        public Builder withBirthDate(LocalDate date){
            this.customer.setBirthDate(date);
            return this;
        }

        public Builder withInvoiceAddress(String address){
            this.customer.setInvoiceAddress(address);
            return this;
        }

        public Customer build(){
            return this.customer;
        }

    }
}
