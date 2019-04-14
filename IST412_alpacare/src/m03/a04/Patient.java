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
public class Patient extends Person{
    final int MALE = 1, FEMALE = 2;
    private String dob;
    private int gender;
    private int patientID;
    
    
    public Patient(String fName, String lName, String dob, int gender){
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.gender = gender;
        this.type = "Patient";
        patientID = createPatientID();
    }
    
    public Patient(){
        this.fName = "";
        this.lName = "";
        this.dob = "";
        this.gender = 1;
        this.type = "Patient";
        patientID = createPatientID();
    }
    
    private int createPatientID() {
        return 1;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the gender
     */
    public int getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(int gender) {
        this.gender = gender;
    }

    /**
     * @return the patientID
     */
    public int getPatientID() {
        return patientID;
    }
    
}
