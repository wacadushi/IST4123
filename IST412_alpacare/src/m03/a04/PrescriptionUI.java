/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author myphs
 */
public class PrescriptionUI {
    PrescriptionList pl1 = new PrescriptionList();
     JFrame frame = new JFrame();
     String[] prescriptionStrings;
     JComboBox cmbPrescriptionLIST;
     JTextArea textArea;
     JLabel patientLabel;
     JButton backButton;
     
    public PrescriptionUI(String[] prescriptionStrings){
        this.prescriptionStrings  = prescriptionStrings;
        backButton = new JButton("Back");
        
        JPanel panel = new JPanel();
        
        
        frame = new JFrame("Prescriptions");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(new Dimension(250, 500));
        frame.setLocationRelativeTo(null);

        cmbPrescriptionLIST = new JComboBox(prescriptionStrings);
        
        cmbPrescriptionLIST.setSelectedIndex(0);
        
        panel.add(cmbPrescriptionLIST);
        
        patientLabel = new JLabel("Patient Name:               ");
        
        panel.add(patientLabel);
        
        textArea = new JTextArea();
        textArea.setColumns(18);
        textArea.setLineWrap(true);
        textArea.setRows(20);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        panel.add(scrollPane);
        
        panel.add(backButton);
        
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
