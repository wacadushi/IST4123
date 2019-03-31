/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author fivewen
 */
public class DashBoardCtrl {
    NavigationUI nui;
    
    public DashBoardCtrl(NavigationUI nui, Person p){
        this.nui = nui;
        DashBoardUI dui = new DashBoardUI(p);
        
        dui.backButton.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
             showMainMenu();
             dui.frame.setVisible(false);
          }
        });
        
    }
    
    public void showMainMenu(){
        nui.frame.setVisible(true);
    }
}
