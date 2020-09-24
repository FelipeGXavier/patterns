package com.algorithms.creational.prototype.app;

import com.algorithms.creational.prototype.Cell;
import com.algorithms.creational.prototype.SpreadSheet;

public class Main {

    public static void main(String[] args) {
        SpreadSheet spreadSheet = new SpreadSheet(3,3);
        spreadSheet.addCell("A1","Cidade");
        spreadSheet.addCell("B1","UF");
        spreadSheet.addCell("A2","Rio do Sul");
        spreadSheet.addCell("B2","SC");
        spreadSheet.addCell("A3","São Paulo");
        spreadSheet.addCell("B3","SP");

        SpreadSheet spreadSheetPopulation = spreadSheet.clone();
        // Sem alteração no que foi clonado
        spreadSheetPopulation.addCell("A2","Teste");

        spreadSheetPopulation.addCell("C1","População");
        spreadSheetPopulation.addCell("C2","70K");
        spreadSheetPopulation.addCell("C3","12M");

        spreadSheetPopulation.convertToExcel();

    }
}
