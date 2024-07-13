import javax.swing.JApplet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JEmployeeTitle extends JApplet implements ActionListener{

public int x;
JTextField name = new JTextField ("", 30);
JTextField title = new JTextField("", 20);

JButton button = new JButton("CLICK TO KNOW DETAILS");

JLabel label1 = new JLabel ("Name Of Employee");
JLabel label2 = new JLabel ("JOB Title of Employee");
JLabel label3 = new JLabel ("Status Of Employee: ");

FlowLayout flow = new FlowLayout();
Container con = getContentPane();

String nm[]= {"Peter", "Rozy John","Sholy Joy","Rob","stella rose"};

String titl[]=
{"Manager",  "Professor", "ASSt.Prof.","Lecturer","Secretary"};

public void init (){

con. setLayout(flow);

con.add (label1);
con.add (name);

con.add (label2);
con.add (title);

con. add (button);
con.add (label3);

button.addActionListener (this);
button.requestFocus ();
}

public void actionPerformed1(ActionEvent e){

String str = name.getText ();
int p=0;
for (x=0; x < 5 ; ++x)
if(str.equalsIgnoreCase (nm [x]))
{
title.setText(titl[x]);
label3.setText(titl[x]);
p=1;
}

if (p==0) {

title.setText ("");
label3.setText ("Sorry ! Employee Not Found");
}
}

@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub

}}