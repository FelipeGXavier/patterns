package com.algorithms.creational.prototype;

public class CellWrapper {

    private final int row;
    private final int col;

    public CellWrapper(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
