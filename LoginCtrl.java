/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

/**
 *
 * @author fivewen
 */
public class LoginCtrl {
    private UserList theUserList;
    private LoginView loginView;
    private NavigationCtrl theNavigationCntl;
    
    
    public LoginCtrl(){
        theUserList = new UserList();
        loginView = new LoginView(this);
        loginView.setLocationRelativeTo(null);
        loginView.setVisible(true);
    }
    
    public void requestNavigationCntl(){
        loginView.setVisible(false);
    }
    
    public boolean requestAuthenticate(String usernameToCheck, char[] passwordToCheck){
        boolean authenticated = false;
        
        if(theUserList.authenticate(usernameToCheck, passwordToCheck) != null){
            authenticated = true;
            theNavigationCntl = new NavigationCtrl(theUserList.authenticate(usernameToCheck, passwordToCheck));
        }
        
        return authenticated;
    }
}

