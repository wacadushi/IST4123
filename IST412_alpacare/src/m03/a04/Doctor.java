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
public class Doctor extends Person{
    int doctorID;
    
    public Doctor(String username, char[] pass, String fName, String lName, String cell, String email){
        this.fName = fName;
        this.lName = lName;
        this.cell = cell;
        this.email = email;
        this.type = "Doctor";
        this.username = username;
        this.password = pass;
    }
    
    public Doctor(){
        this.fName = "";
        this.lName = "";
        this.cell = "";
        this.email = "";
        this.type = "Doctor";
        this.username = "test";
        this.password = "test".toCharArray();

        doctorID = createDoctorID();
    }
    
    public int getDoctorID(){
        return doctorID;
    }
    
    private int createDoctorID() {
        return 1;
    }
}
