package question3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Question3 {

    public static void main(String[] args) {
        class ProductManager extends JFrame {
            
            //Labels
            JLabel id_label;
            JLabel name_label;
            JLabel price_label;
            JLabel file_title;
            
            //Textfields
            JTextField id_field;
            JTextField name_field;
            JTextField price_field;
            
            //Buttons
            JButton submit;
            JButton search;
            
            //Text Area
            JTextArea area;
            
            public ProductManager() {
                this.setTitle("Products Form");
                this.setLayout(null);
                id_label = new JLabel("Product ID: ");
                id_label.setBounds(20, 50, 100, 30);
                this.add(id_label);
                
                name_label = new JLabel("Product Name: ");
                name_label.setBounds(20, 100, 100 ,30);
                this.add(name_label);
                
                price_label = new JLabel("Product Price: ");
                price_label.setBounds(20, 150, 100, 30);
                this.add(price_label);
                
                //Initialise Fields
                id_field = new JTextField(" ");
                id_field.setBounds(150, 50, 150, 30);
                this.add(id_field);
                
                name_field = new JTextField(" ");
                name_field.setBounds(150, 100, 150, 30);
                this.add(name_field);
                
                price_field = new JTextField(" ");
                price_field.setBounds(150, 150, 150, 30);
                this.add(price_field);
                
                //Initialise Buttons
                submit = new JButton("Submit");
                submit.setBounds(20, 300, 100, 30);
                this.add(submit);
                
                search = new JButton("Search");
                search.setBounds(400, 300, 100, 30);
                this.add(search);
                
                submit.addActionListener {
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try 
                        {
                            area.setText(" ");
                            BufferedWriter writer = null;
                            try {
                                writer = new BufferedWriter(new FileWriter("Products.txt",true));
                            } catch (IOException ex) {
                                Logger.getLogger(Question3.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try {
                                writer.write(id_field.getText());
                            } catch (IOException ex) {
                                Logger.getLogger(Question3.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    
                
                
            
                
            
       
    

