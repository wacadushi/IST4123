/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author myphs
 */
public class DashBoardUI {
    JButton backButton;
    JFrame frame;
    String fName, lName, cell, email, type;
    
    public DashBoardUI(Person p){
        fName = p.getfName();
        lName = p.getlName();
        cell = p.getCell();
        email = p.getEmail();
        type = p.getType();
        
        createUI();
    }
    
    public DashBoardUI(Doctor p){
        fName = p.getfName();
        lName = p.getlName();
        cell = p.getCell();
        email = p.getEmail();
        type = p.getType();
        
        createUI();
    }   
    
    public DashBoardUI(Pharmacist p){
        fName = p.getfName();
        lName = p.getlName();
        cell = p.getCell();
        email = p.getEmail();
        type = p.getType();
        
        createUI();
    }   
    
    public DashBoardUI(Patient p){
        fName = p.getfName();
        lName = p.getlName();
        cell = p.getCell();
        email = p.getEmail();
        type = p.getType();
        
        createUI();
    }   
    
    private void createUI(){
        frame = new JFrame("Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(310,600);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        FlowLayout experimentLayout = new FlowLayout();
        panel.setLayout(experimentLayout);
        frame.add(panel);
        
        panel.add(new JLabel(new ImageIcon("profile.png")));
        
        JLabel fNameLabel= new JLabel("First Name: "); 
        JLabel lNameLabel= new JLabel("Last Name: "); 
        JLabel cellLabel= new JLabel("Cell:             "); 
        JLabel emailLabel= new JLabel("Email:          "); 
        JLabel typeLabel = new JLabel("Type:           ");
        JLabel descLabel = new JLabel("Description");
        
        backButton = new JButton("Back");
        
        JTextField fNameField = new JTextField();
        fNameField.setText(fName);
        fNameField.setPreferredSize(new Dimension(200, 22));
        JTextField lNameField = new JTextField();
        lNameField.setText(lName);
        lNameField.setPreferredSize(new Dimension(200, 22));
        JTextField cellField = new JTextField();
        cellField.setText(cell);
        cellField.setPreferredSize(new Dimension(200, 22));
        JTextField emailField = new JTextField();
        emailField.setText(email);
        emailField.setPreferredSize(new Dimension(200, 22));
        JTextField typeField = new JTextField();
        typeField.setText(type);
        typeField.setPreferredSize(new Dimension(200, 22));
        
        JTextField descField = new JTextField();
        descField.setPreferredSize(new Dimension(275, 85));
        
        panel.add(fNameLabel);  panel.add(fNameField);
        panel.add(lNameLabel);  panel.add(lNameField);
        panel.add(cellLabel);       panel.add(cellField);
        panel.add(emailLabel);    panel.add(emailField);
        panel.add(typeLabel);     panel.add(typeField);
        panel.add(descLabel);      panel.add(descField);
        panel.add(backButton);
       
        frame.setVisible(true);
    }
}
