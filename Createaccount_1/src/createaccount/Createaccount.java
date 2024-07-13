package createaccount;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Createaccount {

    public static Account account = new Account();
    public static List<Task> taskList = new ArrayList<>();

    public static void main(String[] args) {

//for the users first name
        String firstName = JOptionPane.showInputDialog("Please enter your first name");
        account.firstName = firstName;

//for the users surname
        String surname = JOptionPane.showInputDialog("Please enter your surname");
        account.lastName = surname;

//to register the user
        String message = registerUser();
        JOptionPane.showMessageDialog(null, account.username + message);
        boolean loggedIn = false;
        while (!loggedIn) {
            loggedIn = loginUser();
            JOptionPane.showMessageDialog(null, returnLoginStatus(loggedIn));
        }
        
//to add options to select from
        Task task = new Task();
        Object[] possibleChoices = {"1) Add Tasks", "2) Show Report", "3) Report of all tasks",
            "4) Quit"};
        Object selectedValue = null;
        while (selectedValue != "4) Quit") {
            selectedValue = JOptionPane.showInputDialog(null,
                    "Please select an option", "Input", JOptionPane.INFORMATION_MESSAGE, null,
                    possibleChoices, possibleChoices[0]);

            int maxTasks = 0;

            String[] developers;
            String[] tasksname;
            String[] taskid;
            String[] taskstatus;
            int[] duration;
            
//if "Add Tasks" is chosen            
            switch (selectedValue.toString()) {
                case "1) Add Tasks":
                    int totalDuration = 0;
                    String numberOfTasks = JOptionPane.showInputDialog("How many tasks would you like to add?");
                    System.out.println("Tasks to be added:" + numberOfTasks);
                    
                   
                    int numTasks = Integer.parseInt(numberOfTasks);
                    developers = new String[numTasks];
                    
                    tasksname = new String[numTasks];
                    
                    taskid = new String[numTasks];
                    
                    taskstatus = new String[numTasks];
                    
                    duration = new int[numTasks];
                    
                    int counter = 0;

//to create tasks                    
                    while (maxTasks < numTasks) {
                        maxTasks++;
                        String taskName = JOptionPane.showInputDialog("Please enter task name");
                        task.setTaskName(taskName);
                        task.setTaskNumber(maxTasks);
                        tasksname[counter] = taskName;
                        
                        boolean validDescr = false;
                        while (!validDescr) {
                            validDescr = task.checkTaskDescription();   }
                        JOptionPane.showMessageDialog(null, "Task Successfully Captured");
                        Scanner input = new Scanner(System.in);
                        
//to add the developers of the task                      
                        String devTask = JOptionPane.showInputDialog("Please enter Developer Details");
                        task.setDeveloperDetails(devTask);
                        developers[counter] = devTask;
                        
//to add the duration of the task                        
                        String timeTask = JOptionPane.showInputDialog("Please enter task duration");
                        task.setTaskDuration(Integer.parseInt(timeTask));
                        totalDuration = totalDuration + task.getTaskDuration();
                        duration[counter] = Integer.parseInt (timeTask);
                        
//to create the task status                       
                        task.setTaskId(task.createTaskID());
                        String[] values = {"To Do", "Done", "Doing"};
                        String valueSelected = JOptionPane.showInputDialog(null,
                            "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE, null,
                            values, values[0]).toString();
                        taskstatus[counter] = valueSelected;
                        
//to show the task                       
                        task.setTaskStatus((String) valueSelected);
                        JOptionPane.showMessageDialog(null, "Task Details: " + task.printTaskDetails());
                        taskList.add(task);
                        task = new Task();
                        counter++;
                    }
                    JOptionPane.showMessageDialog(null, "Total Duration Of Tasks: " + task.returnTotalHours(taskList));
                    break;
                
//if "Show report" is chosen                
                case "2) Show Report":
                    for(int i = 0; i < taskList.size(); i++) {
                        if(taskList.get(i).taskStatus.equals("Done")) {
                            JOptionPane.showMessageDialog(null, taskList.get(i).printTaskDetails());    
                        }
                        
                    }
                    break;
            }
        }

    }

//to create and check the username
    public static boolean checkUserName(String username) {
        if (!username.contains("_")) {
            return false;
        } else if (username.length() > 5) {
            return false;
        }
            return true;
    }

//to create the password    
    public static boolean checkPasswordComplexity(String password) {

//to check if the password is minimum 8 characters or more
        if (password.length() < 8) {
            return false;
        }
        
//to check if the password contains a special character
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        boolean hasSpecialChar = m.find();
        if (!hasSpecialChar) {
            return false;
        }
//to check if the password contains a number
        p = Pattern.compile("[0-9]");
        m = p.matcher(password);
        boolean containsNumber = m.find();
        if (!containsNumber) {
            return false;
        }

//to check if the password contains a captital letter
        p = Pattern.compile("[A-Z]");
        m = p.matcher(password);
        boolean containsCapitals = m.find();
        return containsCapitals;
    }

    public static String registerUser() {

//to make the user create a username
        String userName = JOptionPane.showInputDialog("Please enter username");
        account.username = userName;
        boolean isValidUserName = false;
        
//to validate the users selected username
        while (!isValidUserName) {
            isValidUserName = checkUserName(userName);
            if (!isValidUserName) {
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
                userName = JOptionPane.showInputDialog("Please enter username");
                account.username = userName;
            }
        }

//to make the user create a password
        String password = JOptionPane.showInputDialog("Please enter password:");
        account.password = password;
        boolean isValidPassword = false;
        
//to validate the users selected password
        while (!isValidPassword) {
            isValidPassword = checkPasswordComplexity(password);
            if (!isValidPassword) {
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
                password = JOptionPane.showInputDialog("Please enter password:");
                account.password = password;
            }
        }

        return "Username & password registered successfully";
    }

    public static boolean loginUser() {
        
//to allow the user to login with their username
        String username = JOptionPane.showInputDialog("Please enter username to login:");
        String password = JOptionPane.showInputDialog("Please enter password to login:");
        boolean usernameCorrect = false;
        boolean passwordCorrect = false;
        if (username.equalsIgnoreCase(account.getUsername())) {
            usernameCorrect = true;
        }
//to allow the user to login with their password
        if (password.equals(account.getPassword())) {
            passwordCorrect = true;
        }
        return usernameCorrect && passwordCorrect;
    }

//to show the welcome screen
    public static String returnLoginStatus(boolean loggedIn) {
        if (loggedIn) {
            return ("Welcome to EasyKanban");
        
//if the user has entered the incorrect username &/or password        
        } else {
            return ("Username or password incorrect, please try again");
        }
    }

}
