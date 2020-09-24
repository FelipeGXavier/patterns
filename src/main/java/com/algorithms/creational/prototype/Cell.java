package com.algorithms.creational.prototype;

import java.util.Objects;

public class Cell implements Prototype<Cell>{

    private final String identifier;
    private final String value;

    public Cell(String identifier, String value) {
        this.identifier = identifier;
        this.value = value;
    }

    private Cell(Cell cell){
        this(cell.getIdentifier(), cell.getValue());
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getValue() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return Objects.equals(identifier, cell.identifier) &&
                Objects.equals(value, cell.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cell{");
        sb.append("identifier='").append(identifier).append('\'');
        sb.append(", value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Cell clone() {
        return new Cell(this);
    }
}
