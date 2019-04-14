/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.a04;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableRowSorter;
import m03.a04.NavigationCtrl;
import m03.a04.TableModel;

/**
 *
 * @author Scott
 */
public class DrugListUI extends JFrame{
    private NavigationCtrl theNavigationCntl = null;
    private DrugListCntl theDrugListCntl = null;
    private TableModel tableModel = null;
    
    private JTable theDrugTable;
    private JScrollPane theScrollPane;
    TableRowSorter<javax.swing.table.TableModel> drugTableSorter;
    
    private JButton backButton;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    
    public DrugListUI(DrugListCntl parentDrugListCntl){
        
        theDrugListCntl = parentDrugListCntl;
        
        this.setSize(300, 400);
        this.setTitle("Drugs");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        initCustomComponents();//creates buttons
        
        theDrugTable = new JTable(this.theDrugListCntl.getTableModel());
        theDrugTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        theDrugTable.getColumnModel().getColumn(1).setPreferredWidth(15);
        theDrugTable.getColumnModel().getColumn(2).setPreferredWidth(20);
        
        drugTableSorter = new TableRowSorter<javax.swing.table.TableModel>(this.theDrugTable.getModel());
        theDrugTable.setRowSorter(drugTableSorter);
 
        //Put everything together
        theScrollPane = new JScrollPane(theDrugTable);
        theScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        theScrollPane.setPreferredSize(new Dimension(200,320));
        theDrugTable.setFillsViewportHeight(true);
        
        
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,4));
        JPanel tablePanel = new JPanel();
        tablePanel.add(theScrollPane); 


        buttonPanel.add(backButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(editButton);
        buttonPanel.add(addButton);

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(tablePanel, BorderLayout.CENTER);
    }
    
    public void initCustomComponents(){
        
        backButton = new JButton("Back");
            backButton.setPreferredSize(new Dimension(30,40));
        addButton = new JButton("Add");
            addButton.setPreferredSize(new Dimension(30,40));
        editButton = new JButton("Edit");
            editButton.setPreferredSize(new Dimension(30,40));
        deleteButton = new JButton("Delete");
            deleteButton.setPreferredSize(new Dimension(30,40));
            
        
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
                theDrugListCntl.getNavigationCntl();
            }
        });
        /**
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //add stuff
                int selectedModelRow = -1;
                Drug selectedDrug = null;
                theDrugListCntl.getDrugDetailUI(selectedModelRow, selectedDrug);
            }
        });
        
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int selectedTableRow = theDrugTable.getSelectedRow();
                int selectedModelRow = theDrugTable.convertRowIndexToModel(selectedTableRow);
                Drug selectedDrug = theDrugCtrl.getDrugList().getListOfDrug().get(selectedModelRow);
                theDrugCntl.getDrugDetailUI(selectedModelRow, selectedDrug);
                System.out.println(selectedDrug.toString());
            }
        });
        
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int selectedTableRow = theDrugTable.getSelectedRow();
                int selectedModelRow = theDrugTable.convertRowIndexToModel(selectedTableRow);
                DrugListUI.this.theDrugListCntl.getDrugList().getListOfDrug().remove(selectedModelRow);
                DrugListUI.this.theDrugListCntl.saveData();
                theDrugCntl.getDrugTableModel().fireTableDataChanged();
            }
        });
        **/
    }//end of init
}
