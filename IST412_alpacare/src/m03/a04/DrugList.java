/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

import java.util.ArrayList;

/**
 *
 * @author Scott
 */
public class DrugList {
    public ArrayList<Drug> theDrugList = null;
    
    public DrugList(){
        if(theDrugList == null){
            buildTestDrugList();
        }
    }
    
    public void buildTestDrugList(){
        theDrugList = new ArrayList<Drug>();
        for(int i = 0; i < 100; i++){
            Drug tempDrug= new Drug(("Drug"+i), i, ("Company" + i));
            theDrugList.add(tempDrug);
        }
    }
    
    public ArrayList<Drug> getListOfDrugs(){
        return theDrugList;
    }
}
