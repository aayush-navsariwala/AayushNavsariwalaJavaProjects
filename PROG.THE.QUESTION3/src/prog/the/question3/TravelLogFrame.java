/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.the.question3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class TravelLogFrame
        extends JFrame
        implements ActionListener {

    private final ArrayList<TravelDetails> hospitalDetailList = new ArrayList();

    // Components of the Form
    private final Container container;

    File travelLogFile = new File("travel.txt");

    private final JLabel startLocation;
    private final JComboBox startLocationSelecton;
    private final JLabel endLocation;
    private final JComboBox endLocationSelection;
    private final JLabel travelBy;
    private final JComboBox travelBySelection;
    private final JButton submit;
    private final JTextArea tout;
    private final String locations[] = {"Cape Town", "Durban", "Port Elizabeth"};
    private final String travelTypes[] = {"Airplane", "Train"};

    // constructor, to initialize the components
    // with default values.
    public TravelLogFrame() {
        setTitle("Travel Log");
        setBounds(300, 90, 400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);
//setting position of start location
        startLocation = new JLabel("Start Location:");
        startLocation.setFont(new Font("Arial", Font.PLAIN, 15));
        Dimension size = startLocation.getPreferredSize();
        startLocation.setBounds(10, 50, size.width + 30, size.height);
        container.add(startLocation);
//allowing user to choose
        startLocationSelecton = new JComboBox(locations);
        startLocationSelecton.setFont(new Font("Arial", Font.PLAIN, 15));
        startLocationSelecton.setSize(200, 20);
        startLocationSelecton.setLocation(180, 50);
        container.add(startLocationSelecton);
//setting position of end location
        endLocation = new JLabel("End Location:");
        endLocation.setFont(new Font("Arial", Font.PLAIN, 15));
        size = endLocation.getPreferredSize();
        endLocation.setBounds(10, 100, size.width + 30, size.height);
        container.add(endLocation);
//allowing user to choose
        endLocationSelection = new JComboBox(locations);
        endLocationSelection.setFont(new Font("Arial", Font.PLAIN, 15));
        endLocationSelection.setSize(200, 20);
        endLocationSelection.setLocation(180, 100);
        container.add(endLocationSelection);
//setting position of travel by location
        travelBy = new JLabel("Travel by:");
        travelBy.setFont(new Font("Arial", Font.PLAIN, 15));
        size = travelBy.getPreferredSize();
        travelBy.setBounds(10, 150, size.width + 30, size.height);
        container.add(travelBy);
// asking for  input
        travelBySelection = new JComboBox(travelTypes);
        travelBySelection.setFont(new Font("Arial", Font.PLAIN, 15));
        travelBySelection.setSize(200, 20);
        travelBySelection.setLocation(180, 150);
        container.add(travelBySelection);
//setting location of submit
        submit = new JButton("SUBMIT");
        submit.setFont(new Font("Arial", Font.PLAIN, 15));
        submit.setSize(200, 20);
        submit.setLocation(100, 200);
        submit.addActionListener(this);
        container.add(submit);
//displaying all information here
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(360, 125);
        tout.setLocation(10, 250);
        tout.setLineWrap(true);
        tout.setEditable(false);
        container.add(tout);

        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            if (startLocationSelecton.getSelectedItem().equals(endLocationSelection.getSelectedItem())) {
                JOptionPane.showMessageDialog(null, "Destinations cannot be the same!");
            } else {
                try {

                    FileWriter myWriter = new FileWriter("travel.txt");
                    if (travelLogFile.createNewFile()) {
                        myWriter.write("TRAVEL LOG"
                                + "\n*************************************"
                                + "\nDestination 1:  " + startLocationSelecton.getSelectedItem().toString()
                                + "\nDestination 2:  " + endLocationSelection.getSelectedItem().toString()
                                + "\nTravel By:  " + travelBySelection.getSelectedItem().toString()
                                + "\n*************************************");
                        myWriter.close();
                    } else {
                        myWriter.write("TRAVEL LOG"
                                + "\n*************************************"
                                + "\nDestination 1:  " + startLocationSelecton.getSelectedItem().toString()
                                + "\nDestination 2:  " + endLocationSelection.getSelectedItem().toString()
                                + "\nTravel By:  " + travelBySelection.getSelectedItem().toString()
                                + "\n*************************************");
                        myWriter.close();
                    }

                    try (Scanner myReader = new Scanner(travelLogFile)) {
                        StringBuilder data = new StringBuilder("");
                        while (myReader.hasNextLine()) {
                            data.append(myReader.nextLine()).append("\n");
                        }
                        tout.setText(data.toString());
                    }
                } catch (IOException exception) {
                    System.out.println("An error occurred.");
                }
            }
        }
    }
}


