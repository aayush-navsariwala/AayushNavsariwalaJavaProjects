package hospitalinspections2;

//ST10243270 AAYUSH NAVSARIWALA

import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import javax.swing.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class HospitalInspections2 extends JFrame {
    public static void main(String[] args) {
    
        //Declaring the names of everything
    JFrame frame;
    JPanel buttonPane, fieldsPanel;
    JLabel HospitalName, HospitalLocation, YearsSinceInspection;
    JTextField HospitalNameTxt, HospitalLocationTxt;
    JButton Save, Print, Clear;
    Integer[] years = {1, 2, 3, 4, 5};
    
    
        //Declaring all of the textfields, buttons and panels for the interface
        frame = new JFrame("Hospital Inspections");
        
        buttonPane = new JPanel();
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.X_AXIS));
        buttonPane.setPreferredSize(new Dimension(500, 500));

        //For the panels with text
        fieldsPanel = new JPanel();
        HospitalName = new JLabel("Hospital Name:");
        HospitalLocation = new JLabel("Hospital Location:");
        YearsSinceInspection = new JLabel("Years since inspection:");
        HospitalNameTxt = new JTextField(" ");
        HospitalLocationTxt = new JTextField(" "); 
        
        //For the buttons
        Save = new JButton("Save");
        Print = new JButton("Print");
        Clear = new JButton("Clear");
        
        fieldsPanel.setLayout(new BoxLayout(fieldsPanel, BoxLayout.PAGE_AXIS));
        buttonPane.setLayout(new FlowLayout());
        
        //For the textfields
        fieldsPanel.add(HospitalName);
        fieldsPanel.add(HospitalNameTxt);
        fieldsPanel.add(HospitalLocation);
        fieldsPanel.add(HospitalLocationTxt);
        fieldsPanel.add(YearsSinceInspection);
        
        //For the combo box
        JComboBox yearsCombo = new JComboBox(years);
        fieldsPanel.add(yearsCombo);
        
        //For the list box
        
        
        //For the menu bar
        JMenuBar mb = new JMenuBar();
        JMenu File = new JMenu ("File");
        JMenu Tools = new JMenu ("Tools");
        frame.setJMenuBar(mb);
        mb.add(File);
        mb.add(Tools);
        JMenuItem m11 = new JMenuItem("Exit");
        JMenuItem m21 = new JMenuItem("Save");
        JMenuItem m22 = new JMenuItem("Print");
        JMenuItem m23 = new JMenuItem("Clear");
        File.add(m11);
        Tools.add(m21);Tools.add(m22);Tools.add(m23);
        
        //Adding the buttons
        buttonPane.add(Save);
        buttonPane.add(Print);
        buttonPane.add(Clear);
        
        frame.add(fieldsPanel, BorderLayout.PAGE_START);
        frame.add(buttonPane, BorderLayout.PAGE_END);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
        //Array list for user inputs
        ArrayList<String> HospitalNameText = new ArrayList<String>();
        ArrayList<String> HospitalLocationText = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] HospitalNameTxt;
        String[] HospitalLocationTxt;
        
        //For the buttons

        }
            
        
        
    
        
   
    
     
        
        
        
        
    

   
        
                
    
    
