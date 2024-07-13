import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JApplet {

public abstract class JEmployeeTitle extends javax.swing.JApplet implements ActionListener {   
    
        
    Scanner reader=new Scanner(System.in);
    ArrayList<String> memory= new ArrayList<String>();  
    
    {
        memory.add(reader.nextLine());
        System.out.println(memory.toString());
    }
    
    String[] employeeNames= {"Peter", "Michael","John","Robert","Nicole"};
    String[] employeeJobs= {"Manager",  "CEO", "Professor" ,"Accountant","Secretary"};
    
    JLabel labelName = new JLabel ("Employee Name:");
    JLabel labelJob = new JLabel ("Employee Job Title:");
    JLabel labelStatus = new JLabel ("Status Of Employee: ");

    JTextField names = new JTextField ("", 15);
    JTextField title = new JTextField("", 15);

    JButton button = new JButton("Submit");

    Container con = getContentPane();

    @Override
    public void init() {
        
        con.setLayout(new FlowLayout());

        con.add (labelName);
        con.add (names);

        con.add (labelJob);
        con.add (title);

        con.add (labelStatus);
        con.add (button);
    
        names.addActionListener(this);
        title.addActionListener(this);
        button.addActionListener (this);
    }
    
public void actionPerformed1(ActionEvent ae){

    String name = names.getText();
    String job = title.getText ();
    boolean isFound = false;
    if(!name.equals(""))
    {
        for 
                (int i=0;i<employeeNames.length;i++)
        
        {
           if(employeeNames[i].equalsIgnoreCase(name))
           {
        title.setText(employeeJobs[i]);
        isFound = true;
        break;
           }
        }
        if(!isFound)
        {
            names.setText(name+ "is not found!");
            title.setText("");
        }
    }
    else if(!employeeJobs.equals(""))
    {
     for(int i=0;i<employeeJobs.length;i++)
     {
        if(employeeJobs[i].equalsIgnoreCase(job))
        {
        names.setText(employeeNames[i]);isFound=true;
        break;
        }
     }
     if(!isFound)
     {
         names.setText("");
         title.setText(job + "is not found!");
     }
    }
    else
    {
    names.setText("Enter name or job.");
    title.setText("Enter job or name.");
        }
    validate();
     }
           }
}
