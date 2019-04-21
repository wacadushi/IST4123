/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

import m03.a04.NavigationCtrl;
import m03.a04.NavigationUI;
import m03.a04.TableModel;

/**
 *
 * @author Scott
 */
public class DrugListCntl {
    NavigationUI nui;
    private NavigationCtrl theNavigationCntl = null;
    private DrugList theDrugList = null;
    private DrugListUI theDrugListUI = null;
    private DrugUI theDrugUI = null;
    private TableModel theDrugTableModel = null;
    
    public DrugListCntl(NavigationCtrl parentNavigationCntl){
        theNavigationCntl = parentNavigationCntl;
        System.out.println("You made it to DrugCntl");
        theDrugList = new DrugList();
        theDrugTableModel = new TableModel(theDrugList.getListOfDrugs());//new
        theDrugListUI = new DrugListUI(this);
        theDrugListUI.setLocationRelativeTo(null);
        theDrugListUI.setVisible(true);
        
    }
    
    public void getNavigationCntl(){
        theDrugListUI.setVisible(false);
        theDrugListUI.dispose();
        this.theNavigationCntl.setVisible();
    }
    
    public DrugList getDrugList(){
        return theDrugList;
    }
    
    public TableModel getTableModel(){
        return theDrugTableModel;
    }
    
    public void getDrugListUI(){
        theDrugListUI.setVisible(true);
    }
    
    public void updateDrug(int row, Drug newDrug){
        theDrugUI.setVisible(false);
        theDrugList.getListOfDrugs().set(row, newDrug);
        theDrugTableModel.fireTableDataChanged();
        theDrugListUI.setVisible(true);
    }
    
    public void saveNewDrug(Drug newDrug){
        theDrugUI.setVisible(false);
        theDrugList.getListOfDrugs().add(newDrug);
        theDrugTableModel.fireTableDataChanged();
        theDrugListUI.setVisible(true);
    }
//    public void saveData() {
//        SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
//    }
//    
    public void getDrugDetailUI(int selectedRowID, Drug theSelectedDrug){
        theDrugListUI.setVisible(false);
        if(theSelectedDrug != null){
            theDrugUI = new DrugUI(this, selectedRowID, theSelectedDrug);
        }else{
            theDrugUI = new DrugUI(this, -1, null);
        }
        theDrugUI.setLocationRelativeTo(null);
        theDrugUI.setVisible(true);
    }
}
