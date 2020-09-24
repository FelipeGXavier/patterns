package com.algorithms.creational.fluent;

public class CPF {

    private String value;

    public CPF(String value) {
        if(this.isValidCpf(value)){
            this.value = value;
        }else{
            throw new RuntimeException("Invalid CPF input");
        }

    }

    public boolean isValidCpf(String cpf){
        return true;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CPF{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
