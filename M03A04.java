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
public class M03A04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TestDoctor tests AbstractFactory (Object-Oriented pattern implementation)
        PersonnelFactory pf = new PersonnelFactory();
        Person testDoctor = pf.create("Doctor");
        
        //TestDoctor2 tests Dashboard UI Functionality (User interface pattern implementation)
        //Person testPerson2 = new Person("Owen", "Lee", "111-111-1111", "abc1234@psu.edu", "Patient");
        //DashBoardUI db= new DashBoardUI(testPerson2);
        
        LoginCtrl lc = new LoginCtrl(); 
        //NavigationUI nui = new NavigationUI();
    }
}
