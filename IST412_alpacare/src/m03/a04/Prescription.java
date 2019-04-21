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
public class Prescription {
    private Patient pat;
    private String prescription;
    protected int prescriptionID;
    private static int idCounter = 0;
    
    public Prescription(Patient pat, String precription){
        this.pat = pat;
        this.prescription = precription;
        prescriptionID = createPrescriptionID();
        
    }

    public int createPrescriptionID(){
        idCounter++;
        return idCounter;
    }
    
    public int getPrescriptionID(){
        return prescriptionID;
    }
    
    /**
     * @return the pat
     */
    public Patient getPat() {
        return pat;
    }

    /**
     * @param pat the pat to set
     */
    public void setPat(Patient pat) {
        this.pat = pat;
    }

    /**
     * @return the prescription
     */
    public String getPrescription() {
        return prescription;
    }

    /**
     * @param prescription the prescription to set
     */
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    
    
}
