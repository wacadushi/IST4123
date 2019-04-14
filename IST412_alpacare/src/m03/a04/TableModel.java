/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Scott
 */
public class TableModel extends AbstractTableModel{
        
    private static String[] columnNames = {"Drug Name", "Drug Doasage", "Company"};
    private ArrayList<Drug> TableData;
    
    public TableModel(ArrayList<Drug> theDrugTableData){
        TableData = theDrugTableData;
    }
    
    public int getColumnCount() {
        return columnNames.length;
    }
    
    public int getRowCount() {
     return TableData.size();   
    }
    
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    public Object getValueAt(int row, int col) {
        Object objectToReturn = new Object();
        switch(col){
            case 0: objectToReturn = TableData.get(row).getName(); break;
            case 1: objectToReturn = TableData.get(row).getDosage(); break;
            case 2:objectToReturn = TableData.get(row).getCompany(); break;
        }
        return objectToReturn;
    }
    
    public ArrayList<Drug> getListOfMedia(){
        
        return TableData;
    }
    
}
