/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

import java.util.ArrayList;

/**
 *
 * @author myphs
 */
public class PrescriptionList {
    ArrayList<Prescription> prescriptionList;
    
    
    public PrescriptionList()
    {
        prescriptionList = new ArrayList<>();
        addDefaultItems();
    }
    
    public void addDefaultItems()
    {
        Patient p1 = new Patient("John", "Doe", "1996/08/12", 1);
        prescriptionList.add(new Prescription(p1, "abc medicine, 250mg, 1 cap twice a day"));
        prescriptionList.add(new Prescription(p1, "abc syrup, 10ml, take twice a day"));
    }
    
    public Prescription findItem(int id){
        for(int i = 0; i < prescriptionList.size(); i++){
            if(prescriptionList.get(i).prescriptionID == id){
                return prescriptionList.get(i);
            }
        }
        
        return null;
    }
}
