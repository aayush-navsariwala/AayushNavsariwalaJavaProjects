package initialiserecord;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Scanner;

        class Record extends JFrame {

//establish connection to mysql database
private Connection connect;
private Statement stmt;
private ResultSet res;
private PreparedStatement pre_stmt;

void getConnection() {
try {
// This will load the MySQL driver, each DB has its own driver
Class.forName("com.mysql.jdbc.Driver");
// Setup the connection with the DB
connect = DriverManager
.getConnection("jdbc:mysql://localhost/StaffRecord?"
+ "user=root&password=");

// Statements allow to issue SQL queries to the database
stmt = connect.createStatement();
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Connection to database failed!!");
}
}

boolean viewData(int id)
{
String query = "SELECT * from Staff WHERE ID="+Integer.toString(id);
try {
res=stmt.executeQuery(query);
// iterate through the java resultset
while (res.next()) {
this.f_id.setText(Integer.toString(res.getInt("id")));
f_lname.setText(res.getString("Name"));
f_fname.setText(res.getString("Surname"));
f_mi.setText(res.getString("Gender"));
f_address.setText(res.getString("Address"));
f_city.setText(res.getString("Password"));
f_city.setText(res.getString("Confirm Password"));

}
stmt.close();
return true;
} catch (SQLException throwables) {
throwables.printStackTrace();
JOptionPane.showMessageDialog(null, "\nFailed to fetch record!!");
}
return false;
}

boolean insertData()
{
this.ids++;
f_id.setText(Integer.toString(ids));

if(!this.f_id.getText().isEmpty() || this.f_lname.getText().isEmpty() ||
this.f_fname.getText().isEmpty() || this.f_mi.getText().isEmpty() ||
this.f_address.getText().isEmpty() || this.f_city.getText().isEmpty()
|| this.f_state.getText().isEmpty() || this.f_telephone.getText().isEmpty()) {
try {

String query = "INSERT INTO Staff VALUES("+this.ids+","+this.f_lname.getText()+
","+this.f_mi.getText()+","+this.f_address.getText()+","+this.f_city.getText()
+","+this.f_state.getText() +","
+Integer.parseInt(this.f_telephone.getText())+")";

res = stmt.executeQuery(query);
stmt.close();
return true;

} catch (Exception e) {
e.printStackTrace();
JOptionPane.showMessageDialog(null, "\nFailed to insert Record!!");
}
}
else
{
JOptionPane.showMessageDialog(null, "Please enter missing field data");
}
return false;
}

boolean updateData(int id)
{
try {
this.ids++;
String query = "UPDATE Staff SET last_name="+this.f_lname.getText()+
", first_name="+this.f_fname.getText()+"," +
"MI="+this.f_mi.getText()+",address="+this.f_address.getText()
+",city="+this.f_city.getText() +",state="+this.f_state.getText()
+", telephone="+Integer.parseInt(this.f_telephone.getText())
+" WHERE ID="+id+")";

res = stmt.executeQuery(query);
stmt.close();
return true;
} catch (Exception e) {
e.printStackTrace();
JOptionPane.showMessageDialog(null, "\nFailed to update Record!!");
}
return false;
}


boolean clearData()
{
try{
this.f_id.setText("");
f_lname.setText("");
f_fname.setText("");
f_mi.setText("");
f_address.setText("");
f_city.setText("");
f_city.setText("");
f_telephone.setText("");

return true;
}
catch(Exception e)
{
e.printStackTrace();
return false;
}
}

private int ID;
private String f_name;
private String l_name;
char MI;
private String address;
private String city;
private String state;
private long telephone;

private static int ids=100;

JLabel msg;
JLabel l_id;
JLabel l_fname;
JLabel l_lname;
JLabel l_mi;
JLabel l_address;
JLabel l_city;
JLabel l_state;
JLabel l_telephone;

JTextField f_id;
JTextField f_fname;
JTextField f_lname;
JTextField f_mi;
JTextField f_address;
JTextField f_city;
JTextField f_state;
JTextField f_telephone;

JButton b_view;
JButton b_insert;
JButton b_update;
JButton b_clear;

Record() {
getConnection();

this.setLayout(null);
msg = new JLabel("");
msg.setBounds(10, 1, 200, 30);
this.add(msg);

l_id=new JLabel("ID");
l_id.setBounds(10, 30, 30, 25);
this.add(l_id);

f_id=new JTextField("");
f_id.setEditable(false);
f_id.setBounds(80, 30, 120, 25);
this.add(f_id);


l_lname = new JLabel("Last Name");
l_lname.setBounds(10, 70, 100, 25);
this.add(l_lname);

f_lname=new JTextField("");
f_lname.setEditable(true);
f_lname.setBounds(80, 70, 120, 25);
this.add(f_lname);


l_fname=new JLabel("First Name");
l_fname.setBounds(220, 70, 100, 25);
this.add(l_fname);

f_fname=new JTextField("");
f_fname.setEditable(true);
f_fname.setBounds(300, 70, 120, 25);
this.add(f_fname);


l_mi=new JLabel("MI");
l_mi.setBounds(430, 70, 100, 25);
this.add(l_mi);

f_mi=new JTextField("");
f_mi.setEditable(true);
f_mi.setBounds(450, 70, 30, 25);
this.add(f_mi);


l_address=new JLabel("Address");
l_address.setBounds(10, 70+40, 100, 20);
this.add(l_address);

f_address=new JTextField("");
f_address.setEditable(true);
f_address.setBounds(80, 70+40, 160, 25);
this.add(f_address);


l_city=new JLabel("City");
l_city.setBounds(10, 70+40+40, 100, 25);
this.add(l_city);

f_city=new JTextField("");
f_city.setEditable(true);
f_city.setBounds(80, 70+40+40, 120, 25);
this.add(f_city);


l_state=new JLabel("State");
l_state.setBounds(210, 70+40+40, 100, 25);
this.add(l_state);

f_state=new JTextField("");
f_state.setEditable(true);
f_state.setBounds(250, 70+40+40, 120, 25);
this.add(f_state);


l_telephone=new JLabel("Telephone");
l_telephone.setBounds(10, 70+40+40+40, 100, 25);
this.add(l_telephone);

f_telephone=new JTextField("");
f_telephone.setEditable(true);
f_telephone.setBounds(80, 70+40+40+40, 120, 25);
this.add(f_telephone);


//code for buttons
b_view=new JButton("View");
b_view.setBounds(120, 70+40+40+40+40+40, 80, 30);
this.add(b_view);

b_insert=new JButton("Insert");
b_insert.setBounds(200, 70+40+40+40+40+40, 80, 30);
this.add(b_insert);

b_update=new JButton("Update");
b_update.setBounds(200+80, 70+40+40+40+40+40, 80, 30);
this.add(b_update);

b_clear=new JButton("Clear");
b_clear.setBounds(200+80+80, 70+40+40+40+40+40+40+40+40, 80, 30);
this.add(b_clear);


//action listeners for buttons
this.b_view.addActionListener(
new ActionListener() {
@Override
public void actionPerformed(ActionEvent actionEvent) {

Scanner s=new Scanner(System.in);
int id = Integer.parseInt(JOptionPane.showInputDialog(s.nextInt()));
if(viewData(id))
msg.setText("Record fetched successfully!!");
else
msg.setText("Record cannot be fetched!!");
}
}
);
this.b_insert.addActionListener(
new ActionListener() {
@Override
public void actionPerformed(ActionEvent actionEvent) {
if(insertData())
msg.setText("Record Inserted successfully!!");
else
msg.setText("Record insertion failed!!");
}
}
);

this.b_update.addActionListener(
new ActionListener() {
@Override
public void actionPerformed(ActionEvent actionEvent) {
Scanner s=new Scanner(System.in);
int id = Integer.parseInt(JOptionPane.showInputDialog(s.nextInt()));
if(updateData(id))
msg.setText("Record Updated successfully!!");
else
msg.setText("Record cannot be updated!!");
}
}
);

this.b_clear.addActionListener(
new ActionListener() {
@Override
public void actionPerformed(ActionEvent actionEvent) {
if(clearData())
msg.setText("Record Cleared!!");
else
msg.setText("Record cannot be Cleared!!");
}
}
);

}
}

public class initialiseRecord
{
public static void main(String[] args)
{
Record record=new Record();
record.setSize(600, 350);
record.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
record.setVisible(true);
}
}


    

