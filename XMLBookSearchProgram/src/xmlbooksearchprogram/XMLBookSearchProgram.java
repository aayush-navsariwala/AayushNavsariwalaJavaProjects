package xmlbooksearchprogram;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

public class XMLBookSearchProgram {

    private static Document document;
    private static File xmlFile;

    public static void main(String[] args) {
        try {
            //Specifying the directory path and the name of the file:
            String directoryPath = "/C:/Users/aayus/Desktop/Aayush/Zensar/Projects/";
            String fileName = "books for info processor.xml";
            
            //Combining the directory path with the name of the file:
            xmlFile = new File(directoryPath + fileName);
            
            //Checking if the directory exists in the system:
            File directory = new File(directoryPath);
            
            //Using if statements to create the file directory:
            if (!directory.exists()) 
            {
                if (directory.mkdirs()) 
                {
                    System.out.println("Directory created: " + directoryPath);
                } 
                else 
                {
                    System.out.println("Failed to create directory: " + directoryPath);
                    System.exit(1);
                }
            }
            
            //Initialising the application:
            initialize();
            
            //Scanner used for the menu:
            Scanner scanner = new Scanner(System.in);
            while (true) {
                displayMenu();
                int menuChoice = scanner.nextInt();
                scanner.nextLine(); 
                  
                //Switch case used in order to display menu options:
                switch (menuChoice) {
                    //To display all books in the XML file:
                    case 1:
                        displayAllBooks();
                        break;
                    //To search for a specific book in the XML file:
                    case 2:
                        searchForBook(scanner);
                        break;
                    //To add a new book into the XML file:
                    case 3:
                        addNewBook(scanner);
                        break;
                    //Save work to the XML file and terminate the application:
                    case 4:
                        saveAndExit();
                        scanner.close();
                        System.exit(0);
                    //For any number that is not between 1-4:
                    default:
                        System.out.println("You have made an invalid selection. Please try again.");
                }
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    //Use of a document builder:
    private static void initialize() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        //If statement to check if the XML file exists: 
        if (!xmlFile.exists()) 
        {
            document = builder.newDocument();
            Element root = document.createElement("library");
            document.appendChild(root);
        } 
        //Else statement used in case specified XML does not exist and a new one will be created:
        else 
        {
            document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();
        }
    }

    //Method for displaying the menu:
    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Display all books");
        System.out.println("2. Search for a book");
        System.out.println("3. Add a new book");
        System.out.println("4. Save and exit");
        System.out.print("Enter your menuChoice (1/2/3/4): ");
    }

    //Method for the first menu option (displaying all of the books):
    private static void displayAllBooks() {
        NodeList bookList = document.getElementsByTagName("book");
        for (int i = 0; i < bookList.getLength(); i++) {
            Node bookNode = bookList.item(i);
            if (bookNode.getNodeType() == Node.ELEMENT_NODE) {
                Element bookElement = (Element) bookNode;
                displayBookInfo(bookElement);
            }
        }
    }

    //Method to get each element from all of the books:
    private static void displayBookInfo(Element bookElement) {
        String title = getElementTextContent(bookElement, "title");
        String author = getElementTextContent(bookElement, "author");
        String year = getElementTextContent(bookElement, "publication_year");
        String isbn = getElementTextContent(bookElement, "isbn");

        //Method to display each element from all of the books:
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + year);
        System.out.println("ISBN: " + isbn);
        System.out.println("-------------------------");
    }

    private static String getElementTextContent(Element element, String tagName) {
        return element.getElementsByTagName(tagName).item(0).getTextContent();
    }
    
//Method for the second menu option (searching for a specific book):
private static void searchForBook(Scanner scanner) {
    System.out.print("Enter the title, author, or publication year of the book you want to search for: ");
        String query = scanner.nextLine().toLowerCase();
        NodeList bookList = document.getElementsByTagName("book");
        boolean found = false;
        for (int i = 0; i < bookList.getLength(); i++) {
            Node bookNode = bookList.item(i);
            if (bookNode.getNodeType() == Node.ELEMENT_NODE) {
                Element bookElement = (Element) bookNode;
                String title = getElementTextContent(bookElement, "title").toLowerCase();
                String author = getElementTextContent(bookElement, "author").toLowerCase();
                String year = getElementTextContent(bookElement, "publication_year").toLowerCase();
                if (title.contains(query) || author.contains(query) || year.contains(query)) {
                    displayBookInfo(bookElement);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("This book was not found.");
        }
    }

    //Method for the third menu option (adding a new book):
    private static void addNewBook(Scanner scanner) {
        Element root = document.getDocumentElement();
        Element newBook = document.createElement("book");

        addBookInfo(newBook, "title", "Enter title: ", scanner);
        addBookInfo(newBook, "author", "Enter author: ", scanner);
        addBookInfo(newBook, "publication_year", "Enter publication year: ", scanner);
        addBookInfo(newBook, "isbn", "Enter ISBN: ", scanner);

        root.appendChild(newBook);
        System.out.println("New book added.");

        //Automatically saving the changes to the XML file in case the user forgets to press "4" afterwards:
        saveChanges();
    }

    //Taking each element of the book from the user's input:
    private static void addBookInfo(Element bookElement, String tagName, String prompt, Scanner scanner) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        Element element = document.createElement(tagName);
        element.setTextContent(input);
        bookElement.appendChild(element);
    }

    //Programming the save changes for option 3 and 4 of the application:
    private static void saveChanges() {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(xmlFile);
            transformer.transform(source, result);
            System.out.println("Changes saved to the XML file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void saveAndExit() {
        //Saving the changes to the existing XML file before the user exits the program:
        saveChanges();
        System.out.println("Exiting the program.");
    }
}

