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
public class Person {
        String fName, lName, cell, email, type, username;
        protected char[] password;
        
        public Person(String username, char[] pass){
                this.fName = "";
                this.lName = "";
                this.cell = "";
                this.email = "";
                this.type = "";
                this.username = username;
                this.password = pass;
        }
        
        public Person(){
                this.fName = "";
                this.lName = "";
                this.cell = "";
                this.email = "";
                this.type = "";
                this.username = "test";
                this.password = "test".toCharArray();
        }
        
        public Person(String username, char[] pass, String fName, String lName, String cell, String email, String type){
                this.fName = fName;
                this.lName = lName;
                this.cell = cell;
                this.email = email;
                this.type = type;
                this.username = username;
                this.password = pass;
        }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }       

    Object getUsername() {
        return username;
    }

    char[] getPassword() {
        return password;
    }
}
