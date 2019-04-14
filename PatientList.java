/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

import java.util.ArrayList;

/**
 *
 * @author fivewen
 */
public class PatientList {
    ArrayList<Patient> patientList;
    
    public PatientList()
    {
        patientList = new ArrayList<>();
        addDefaultItems();
    }
    
    public void addDefaultItems()
    {
        patientList.add(new Patient("John", "Doe", "07/18/99", 1));
        patientList.add(new Patient("Harry", "Walton", "06/11/55", 1));
        patientList.add(new Patient("Dan", "Johnson", "12/25/69", 1));
        patientList.add(new Patient("Billy", "Zeke", "04/06/05", 1));
        patientList.add(new Patient("Jane", "Smith", "11/24/85", 2));
        patientList.add(new Patient("Taylor", "Quincy", "09/01/91", 2));
        patientList.add(new Patient("Nina", "Jacobs", "01/02/45", 2));
        patientList.add(new Patient("Jessica", "Brunsburg", "02/14/79", 2));
    }
}

