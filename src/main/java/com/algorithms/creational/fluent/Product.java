package com.algorithms.creational.fluent;

public class Product {

    private Barcode barcode;
    private long code;
    private String title;
    private String description;

    public Barcode getBarcode() {
        return barcode;
    }

    private void setBarcode(Barcode barcode) {
        this.barcode = barcode;
    }

    public long getCode() {
        return code;
    }

    private void setCode(long code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("barcode=").append(barcode);
        sb.append(", code=").append(code);
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class Builder{

        private Product product = new Product();

        public Builder(Barcode barcode) {
            this.product.setBarcode(barcode);
        }

        public Builder withTitle(String title){
            this.product.setTitle(title);
            return this;
        }

        public Builder withDescription(String description){
            this.product.setDescription(description);
            return this;
        }

        public Builder withCode(long code){
            this.product.setCode(code);
            return this;
        }

        public Product build(){
            return this.product;
        }
    }
}
