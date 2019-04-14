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



public class PersonnelFactory implements AbstractFactory<Person>{
    public PersonnelFactory(){
        
    }
    
    @Override
    public Person create(String personType) {
        if ("Patient".equalsIgnoreCase(personType)) {
            return new Patient();
         }
        else if ("Doctor".equalsIgnoreCase(personType)) {
            return new Doctor();
         }
        else if ("Pharmacist".equalsIgnoreCase(personType)) {
            return new Pharmacist();
         }
        else
            return new Person();
    }
}
