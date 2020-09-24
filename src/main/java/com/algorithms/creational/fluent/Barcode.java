package com.algorithms.creational.fluent;

public class Barcode {

    private String value;

    public Barcode(String value) {
        if (this.isValidBarCode(value)) {
            this.value = value;
        } else {
            throw new RuntimeException("Invalid Barcode input");
        }

    }

    public boolean isValidBarCode(String value) {
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Barcode{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
