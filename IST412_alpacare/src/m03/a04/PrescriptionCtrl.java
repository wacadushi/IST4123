/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/**
 *
 * @author myphs
 */
public class PrescriptionCtrl {
    NavigationUI nui;
    
    public PrescriptionCtrl(NavigationUI nui){
        
        this.nui = nui;
        
        PrescriptionList pl = new PrescriptionList();
        String[] prescriptionStrings = new String[pl.prescriptionList.size()];
        
        for(int i = 0; i < pl.prescriptionList.size(); i++){
            prescriptionStrings[i] = "Prescription " + pl.prescriptionList.get(i).getPrescriptionID();
        }
        
        PrescriptionUI pui = new PrescriptionUI(prescriptionStrings);
        
         pui.cmbPrescriptionLIST.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
              if(e.getSource() == pui.cmbPrescriptionLIST){
                  JComboBox cb = (JComboBox)e.getSource();
                  String text = (String)cb.getSelectedItem();
                  text = text.substring(13);
                  
                  int index = Integer.parseInt(text);
                  
                  pui.patientLabel.setText("Patient Name: " + pl.findItem(index).getPat().getfName() + " " + pl.findItem(index).getPat().getlName());
                  pui.textArea.setText(pl.findItem(index).getPrescription());
              }
          }
        });
         
         pui.backButton.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
             showMainMenu();
             pui.frame.setVisible(false);
          }
        });
        
    }
    
    public void showMainMenu(){
        nui.frame.setVisible(true);
    }
}
