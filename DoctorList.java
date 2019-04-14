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
public class DoctorList {
    ArrayList<Doctor> doctorList;
    
    public DoctorList()
    {
        doctorList = new ArrayList<>();
        addDefaultItems();
    }
    
    public void addDefaultItems()
    {
        doctorList.add(new Doctor("doc1", "123".toCharArray(), "Matt", "Kemp", 
                "1293091082", "mkdoc@gmail.com"));
        doctorList.add(new Doctor("doc2", "123".toCharArray(), "Peter", "Richardson", 
                "0739892716", "peterRich@hotmail.com"));
        doctorList.add(new Doctor("doc3", "123".toCharArray(), "Nate", "Lee", 
                "2957401638", "nate198@gmail.com"));
        doctorList.add(new Doctor("doc4", "123".toCharArray(), "Zeng", "Da", 
                "8563848372", "zengda@yahoo.com"));
        doctorList.add(new Doctor("doc5", "123".toCharArray(), "Samarj", "Sinha", 
                "2194730485", "sinhasamj@umpn.com"));
    }
}
