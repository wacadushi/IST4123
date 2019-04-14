/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author fivewen
 */
public class UserList {
    
    private ArrayList<Person> listOfUsers = null;
    
    public UserList(){
        if(this.listOfUsers == null){
            this.buildList();
        }
    }
    
    public void buildList(){
        this.listOfUsers = new ArrayList<Person>();
        
        for (int i = 0; i < 5; i++) {
            Person tempUser = new Person("Name " + i, ("PW" + i).toCharArray(), "John", "Doe", "123-456-7890", "user@gmail.com", "Patient");
            this.listOfUsers.add(tempUser);
            
        }
    }
    
    public Person authenticate(String usernameToCheck, char[] passwordToCheck){
        
        for(int i = 0; i < listOfUsers.size(); i++){
            
            if(usernameToCheck.equals(listOfUsers.get(i).getUsername()) && Arrays.equals(passwordToCheck, listOfUsers.get(i).getPassword()) ) {
                return listOfUsers.get(i);
            }
     
        }
        System.out.println("Could not find a user.");
        return null;
    }
}

