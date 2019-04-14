/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

/**
 *
 * @author Scott
 */
public class Drug {
    private String name;
    private int dosage;
    private String Company;
    
    public Drug(String aName, int aDosage, String aCompany){
        this.name = aName;
        this.dosage = aDosage;
        this.Company = aCompany;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the dosage
     */
    public int getDosage() {
        return dosage;
    }

    /**
     * @return the Company
     */
    public String getCompany() {
        return Company;
    }
}
