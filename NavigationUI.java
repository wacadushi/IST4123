/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author fivewen
 */
public class NavigationUI {
    JButton dashboardButton;
    JButton quitButton;
    JButton drugListButton;
    JFrame frame;
    
    public NavigationUI(){
        frame = new JFrame("Main Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        
        frame.setSize(new Dimension(200, 400));
        frame.setLocationRelativeTo(null);
        
        
        dashboardButton = new JButton("View Profile");
        drugListButton = new JButton("Search Drugs");
        quitButton = new JButton("Quit");
        
        
        
        panel.add(dashboardButton);
        panel.add(drugListButton);
        panel.add(quitButton);
        
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
