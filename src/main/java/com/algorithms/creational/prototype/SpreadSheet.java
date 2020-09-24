package com.algorithms.creational.prototype;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

public class SpreadSheet implements Prototype<SpreadSheet> {

    private Cell[][] cells;
    private int numberCols;
    private int numberRows;
    final int MAX_COL = 5;
    final int MAX_ROW = 5;

    public SpreadSheet(int numberCols, int numberRows) {
        this.numberCols = numberCols;
        this.numberRows = numberRows;
        this.cells = new Cell[numberRows][numberCols];
        this.initCells();
    }

    private SpreadSheet(int numberCols, int numberRows, Cell[][] cells) {
        this.numberCols = numberCols;
        this.numberRows = numberRows;
        this.cells = cells;
    }

    protected SpreadSheet(SpreadSheet prototype) {
        this.numberCols = prototype.getNumberCols();
        this.numberRows = prototype.getNumberRows();
        this.cells = this.copyCells(prototype.getCells());
    }

    public void addCell(String identifier, String value) {
        Optional<CellWrapper> cell = this.findCellByIdentifier(identifier);
        if(cell.isPresent()){
            Cell newCell = new Cell(identifier, value);
            this.cells[cell.get().getRow()][cell.get().getCol()] = newCell.clone();
        }
    }

    private void initCells() {
        String[] colLetters = {"A", "B","C","D","E"};
        for (int i = 0; i < this.numberRows; i++){
            for (int j = 0; j < this.numberCols; j++){
                String cellReference = colLetters[j] + (i + 1);
                this.cells[i][j] = new Cell(cellReference,"");
            }
        }
    }

    private Optional<CellWrapper> findCellByIdentifier(String identifier) {
        String columnLetter = identifier.substring(0,1);
        int rowIndex = Integer.parseInt(identifier.substring(1,2)) - 1;
        HashMap<String, Integer> indexes = this.getIdentifierIndexColumn();
        if (!indexes.containsKey(columnLetter)) {
            return Optional.empty();
        }
        return Optional.of(new CellWrapper(rowIndex, indexes.get(columnLetter)));
    }

    private HashMap<String, Integer> getIdentifierIndexColumn() {
        HashMap<String, Integer> indexes = new HashMap<>();
        indexes.put("A", 0);
        indexes.put("B", 1);
        indexes.put("C", 2);
        indexes.put("D", 3);
        indexes.put("E", 4);
        return indexes;
    }

    private Cell[][] copyCells(Cell[][] cells){
        return Arrays.stream(cells)
                .map(Cell[]::clone)
                .toArray(Cell[][]::new);
    }


    @Override
    public SpreadSheet clone() {
       return new SpreadSheet(this);
    }

    public void convertToExcel(){
        System.out.println("Generating file...");
    }

    public Cell[][] getCells() {
        return cells;
    }

    public int getNumberCols() {
        return numberCols;
    }

    public int getNumberRows() {
        return numberRows;
    }

    public int getMAX_COL() {
        return MAX_COL;
    }

    public int getMAX_ROW() {
        return MAX_ROW;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SpreadSheet{");
        sb.append("cells=").append(Arrays.toString(cells));
        sb.append(", numberCols=").append(numberCols);
        sb.append(", numberRows=").append(numberRows);
        sb.append(", MAX_COL=").append(MAX_COL);
        sb.append(", MAX_ROW=").append(MAX_ROW);
        sb.append('}');
        return sb.toString();
    }
}
