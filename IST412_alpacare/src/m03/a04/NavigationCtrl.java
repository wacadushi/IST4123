/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 *
 * @author fivewen
 */
public class NavigationCtrl {
    public NavigationUI theNavigationUI = null;
    Person p;
    NavigationCtrl nc = this;
    
    public NavigationCtrl(Person p){
        this.p = p;
        theNavigationUI = new NavigationUI();
        
        theNavigationUI.dashboardButton.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
             theNavigationUI.frame.setVisible(false);
            
             DashBoardCtrl db= new DashBoardCtrl(theNavigationUI, p);
             
          }
        });
        
        theNavigationUI.quitButton.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
             theNavigationUI.frame.dispatchEvent(new WindowEvent(theNavigationUI.frame, WindowEvent.WINDOW_CLOSING));
          }
        });
        
        theNavigationUI.drugListButton.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
             theNavigationUI.frame.setVisible(false);
            
             DrugListCntl dLC= new DrugListCntl(nc);
             
          }
        });
        
        theNavigationUI.prescriptionButton.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
             theNavigationUI.frame.setVisible(false);
            
            PrescriptionCtrl pc = new PrescriptionCtrl(theNavigationUI);
             
          }
        });
    }
    
    public void setVisible(){
        theNavigationUI.frame.setVisible(true);
    }
}
