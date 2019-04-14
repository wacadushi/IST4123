/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

/**
 *
 * @author myphs
 */
public class Pharmacist extends Person{
    int pharmID;
    String pharmacy;
    
    public Pharmacist(String username, char[] pass, String fName, String lName, String cell, String email, String pharmacy){
        this.fName = fName;
        this.lName = lName;
        this.cell = cell;
        this.email = email;
        this.type = "Pharmacist";
        this.username = username;
        this.password = pass;
        this.pharmacy = pharmacy;
    }
    
    public Pharmacist(){
        this.fName = "";
        this.lName = "";
        this.cell = "";
        this.email = "";
        this.type = "Pharmacist";
        this.username = "test";
        this.password = "test".toCharArray();
        this.pharmacy = "";
        
        pharmID = createPharmID();
    }
    
    public int getPharmID(){
        return pharmID;
    }
    
    private int createPharmID() {
        return 1;
    }
}
