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
public class PharmacistList {
    ArrayList<Pharmacist> pharmacistList;
    
    public PharmacistList()
    {
        pharmacistList = new ArrayList<>();
        addDefaultItems();
    }
    
    public void addDefaultItems()
    {
        pharmacistList.add(new Pharmacist("pharm1", "123".toCharArray(), "Adam", "Goldberg", 
                "3407569321", "adam999@gmail.com", "Sam's Club"));
        pharmacistList.add(new Pharmacist("pharm2", "123".toCharArray(), "Samantha", "Heinz", 
                "0917324943", "samheinz1@hotmail.com", "CVS"));
        pharmacistList.add(new Pharmacist("pharm3", "123".toCharArray(), "Rekha", "Mahanti", 
                "7994401729", "rekkmah@msn.com", "Walgreen"));
        pharmacistList.add(new Pharmacist("pharm4", "123".toCharArray(), "Wu", "Xia", 
                "9628362098", "wuxiah@yahoo.com", "CVS"));
        pharmacistList.add(new Pharmacist("pharm5", "123".toCharArray(), "Sadie", "Harper", 
                "4576234532", "sadharp@weis.com", "Weis"));
    }
}
