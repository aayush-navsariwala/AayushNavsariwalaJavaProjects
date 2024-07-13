
package ryan.khan.the.prog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class HospitalFrame
        extends JFrame
        implements ActionListener {

    private final ArrayList<hospitalDetails> hospitalDetailList = new ArrayList();

    // Components of the Form
    private final Container container;
    private final JMenuBar menuBar;
    JMenu fileMenu, toolMenu;
    JMenuItem exitMenu, saveMenu, printMenu, clearMenu;
    private final JLabel name;
    private final JTextField inputname;
    private final JLabel location;
    private final JTextField inputlocation;
    private final JLabel yearsOfInspection;
    private final JComboBox year;
    private final JButton save;
    private final JButton clear;
    private final JButton print;
    private final JTextArea tout;
    private final String years[]
            = {"1 year", "2 years", "3 years", "4 years", "5 years"};

    // constructor, to initialize the components
    // with default values.
    public HospitalFrame() {
        setTitle("Hospital Inspections");
        setBounds(300, 90, 400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        menuBar = new JMenuBar();

//Build the first menu.
        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

//a group of JMenuItems
        exitMenu = new JMenuItem("Exit", KeyEvent.VK_T);
        exitMenu.addActionListener(this);
        fileMenu.add(exitMenu);

//Build second menu in the menu bar.
        toolMenu = new JMenu("Tools");
        menuBar.add(toolMenu);

        //a group of JMenuItems
        saveMenu = new JMenuItem("Save", KeyEvent.VK_T);
        printMenu = new JMenuItem("Print", KeyEvent.VK_T);
        clearMenu = new JMenuItem("Clear", KeyEvent.VK_T);

        saveMenu.addActionListener(this);
        printMenu.addActionListener(this);
        clearMenu.addActionListener(this);

        toolMenu.add(saveMenu);
        toolMenu.add(printMenu);
        toolMenu.add(clearMenu);

        this.setJMenuBar(menuBar);
// sets the position of hospital name
        name = new JLabel("Hospital Name:");
        name.setFont(new Font("Arial", Font.PLAIN, 15));
        Dimension size = name.getPreferredSize();
        name.setBounds(10, 50, size.width + 30, size.height);
        container.add(name);
// promts user for input of name
        inputname = new JTextField();
        inputname.setFont(new Font("Arial", Font.PLAIN, 15));
        inputname.setSize(200, 20);
        inputname.setLocation(180, 50);
        container.add(inputname);
//sets position of location
        location = new JLabel("Hospital Location:");
        location.setFont(new Font("Arial", Font.PLAIN, 15));
        size = location.getPreferredSize();
        location.setBounds(10, 100, size.width + 30, size.height);
        container.add(location);
//prompts user to enter the location
        inputlocation = new JTextField();
        inputlocation.setFont(new Font("Arial", Font.PLAIN, 15));
        inputlocation.setSize(200, 20);
        inputlocation.setLocation(180, 100);
        container.add(inputlocation);

//sets the place of years of inspection
        yearsOfInspection = new JLabel("Years since inspection:");
        yearsOfInspection.setFont(new Font("Arial", Font.PLAIN, 15));
        size = yearsOfInspection.getPreferredSize();
        yearsOfInspection.setBounds(10, 150, size.width + 30, size.height);
        container.add(yearsOfInspection);
//prompts the user to pick 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(200, 20);
        year.setLocation(180, 150);
        container.add(year);
//saves the  data above
        save = new JButton("SAVE");
        save.setFont(new Font("Arial", Font.PLAIN, 15));
        save.setSize(200, 20);
        save.setLocation(180, 200);
        save.addActionListener(this);
        container.add(save);
// text area where the printed data goes
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(340, 125);
        tout.setLocation(10, 250);
        tout.setLineWrap(true);
        tout.setEditable(false);
        container.add(tout);
//prints the data
        print = new JButton("PRINT");
        print.setFont(new Font("Arial", Font.PLAIN, 15));
        print.setSize(180, 20);
        print.setLocation(12, 400);
        print.addActionListener(this);
        container.add(print);
//clears the data
        clear = new JButton("CLEAR");
        clear.setFont(new Font("Arial", Font.PLAIN, 15));
        clear.setSize(180, 20);
        clear.setLocation(200, 400);
        clear.addActionListener(this);
        container.add(clear);


        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save || e.getActionCommand().equalsIgnoreCase("Save")) {
            if (hospitalDetailList.size() < 5) {
                hospitalDetails hospitalDetails = new hospitalDetails();
                hospitalDetails.setHospitalName(inputname.getText());
                hospitalDetails.setHospitalLocation(inputlocation.getText());
                hospitalDetails.setYearsSinceInspection(year.getSelectedItem().toString());
                hospitalDetailList.add(hospitalDetails);
            } else {
//                comand lines 
                JOptionPane.showMessageDialog(null, "Maximum inspection count reached!");
            }

        } else if (e.getSource() == print || e.getActionCommand().equalsIgnoreCase("Print")) {
            StringBuilder printoutValue = new StringBuilder("");
            for (hospitalDetails hospitalDetails : hospitalDetailList) {
                printoutValue.append("Hospital Name:   ").append(hospitalDetails.getHospitalName());
                printoutValue.append("\nHospital Location:   ").append(hospitalDetails.getHospitalLocation());
                printoutValue.append("\nYears since inspection:   ").append(hospitalDetails.getYearsSinceInspection());
                printoutValue.append("\n****************");
            }
            tout.setText(printoutValue.toString());
            tout.setEditable(false);
        } else if (e.getSource() == clear || e.getActionCommand().equalsIgnoreCase("Clear")) {
            String def = "";
            inputname.setText(def);
            inputlocation.setText(def);
            tout.setText(def);
            year.setSelectedIndex(0);
            tout.setText(def);
        } else {
            System.exit(0);
        }
    }
}