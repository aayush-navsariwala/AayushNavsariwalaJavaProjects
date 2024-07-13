package buttonex1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JPasswordField;

//import java.awt.event.ActionListener;
public class ButtonEx1 extends JFrame {
static JFrame ff = new JFrame("Login App");// Creating a new JFrame with a title
static JButton bb = new JButton("Login");
static JLabel labelone = new JLabel("Enter username:");
static JLabel labeltwo = new JLabel("Enter password:");
static JLabel labelthree = new JLabel();
static JTextField tt1 = new JTextField();
static JTextField tt2 = new JTextField();
static JPasswordField pp1 = new JPasswordField();
// static JRadioButton rr = new JRadioButton();
static String username = "Aayush";
static String password = "Hello";

public static void main(String[] args)
{

ff.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // To Terminate JFrame and the program on close
ff.setSize(400, 300); // To set the size of the frame
ff.setLayout(null); // To terminate the default flow layout
ff.setVisible(true); // To display the frame

bb.setBounds(250, 200, 95, 30);
//bb.setLocation(250, 200);

ff.add(bb);
bb.addActionListener(new ActionListener() {@Override
public void actionPerformed(ActionEvent e) {
    username = new String(tt1.getText());
    password = new String(pp1.getPassword());
    if
            ((username.equals("Aayush")) && password.equals("Hello"))
    {
        JOptionPane.showMessageDialog(null, "Login successful");
    }
    else
    {
        JOptionPane.showMessageDialog(ff, "Incorrect username or password");
        labelthree.setText("Enter username and password");
    }
    }
}
);

labelone.setBounds(20, 40, 150, 60);
// labelone.setLocation(0, 0);
labelone.setFont((new Font("Arial", Font.PLAIN, 18)));
ff.add(labelone);

labeltwo.setBounds(20, 80, 150, 60);
//labeltwo.setLocation(50, 100);
labeltwo.setFont((new Font("Arial", Font.PLAIN, 18)));
ff.add(labeltwo);

labelthree.setBounds(20, 120, 200, 60);
labelthree.setFont((new Font("Arial", Font.PLAIN, 14)));
ff.add(labelthree);

tt1.setBounds(170, 60, 150, 30);
ff.add(tt1);

pp1.setBounds(170, 100, 150 ,30);
ff.add(pp1);

/*tt2.setBounds(170, 100, 150, 30);
ff.add(tt2);*/

    }
}