package vehicle;

import java.util.Scanner;

class Main {
    
    //Vehicle variables are set to private
    private String brand;
    private String model;
    private String year;
    private String colour;
    
    //Constructor of parameters
    public Main(String brand, String model, String year, String colour) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }
    
     //Print details for public method
    public void printDetails() {
        System.out.println("\t\tBrand: " + brand);
        System.out.println("\t\tModel: " + model);
        System.out.println("\t\tYear: " + year);
        System.out.println("\t\tColour: " + colour);
    }
    
}

    //Creating a new class called car
    class Car extends Main {

    //Declaring private variables
    private String bodyType;
    private String price;

    // Parameterized Constructor
    public Car(String brand, String model, String year, String colour, String bodyType,  String price) {
        super(brand, model, year, colour);  
        this.bodyType = bodyType;
        this.price = price;
        
    }
    //For the details of the car
    public void carDetails() {  
        //The calling method from the parent class
        printDetails();         
        System.out.println("\t\tBody Type: " + bodyType);
        System.out.println("\t\tPrice: " + price);
    }
    
    }
class Vehicle {
    

    public static void main(String[] args) {
        //The array to be used to store the cars that are to be sold
        String[][] cars_for_sale = {
                {"BMW", "White", " Sedan", "2009","3 Series","R150,000","135,000 KM"},
                {"Audi", "Black", "SUV ", "2020", "Q5","R595,000","62,000 KM"},
                {"Toyota","Blue", "Hatchback","2001","Tazz","R98,000","167,000 KM"},
                {"Ford","Red","Hatchback","2015", "Fiesta","R195,000","87,500 KM"},
                 }; 
        
        //Output of the menu used for the application
        System.out.println("Welcome to Mak's Car Delears");
        System.out.println("We have a whole range of vehicles for you to choose from");
        System.out.println("1. View all of our cars");
        System.out.println("2. View our cars by brand");
        System.out.print("Please select 1 or 2: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option == 1)
        {
            for(int i = 0; i<cars_for_sale.length;i++) 
            {
        
                System.out.print(i+1);
            Car elantraSedan = new Car(cars_for_sale[i][0],cars_for_sale[i][4],
                    cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); //creation of car Object
            elantraSedan.carDetails(); //calling method to print details
          }
        }
        else if(option==2)
        {
            System.out.println("1. View Toyota cars");
            System.out.println("2. View Ford cars");
            System.out.println("3. View Audi cars");
            System.out.println("4. View BMW cars");
            System.out.print("Enter you option: ");
            int myoption = sc.nextInt();
            if(myoption == 1)
            {  int count = 1;
                for(int i = 0; i<cars_for_sale.length;i++)
                {
                    if(cars_for_sale[i][0] == "Toyota") {
                        System.out.print(count);
                        Car elantraSedan = new Car(cars_for_sale[i][0], cars_for_sale[i][4],
                                cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); //creation of car Object
                        elantraSedan.carDetails(); //calling method to print details
                        count = count +1;
                    }
                }
            }
            else if(myoption == 2)
            {
                int count = 1;
                for(int i = 0; i<cars_for_sale.length;i++)
                {
                    if(cars_for_sale[i][0] == "Ford") {
                        System.out.print(count);
                        Car elantraSedan = new Car(cars_for_sale[i][0], cars_for_sale[i][4],
                                cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); //creation of car Object
                        elantraSedan.carDetails(); //calling method to print details
                        count = count +1;
                    }
                }
            }
            else if(myoption == 3)
            {
                int count = 1;
                for(int i = 0; i<cars_for_sale.length;i++)
                {
                    if(cars_for_sale[i][0] == "Audi") {
                        System.out.print(count);
                        Car elantraSedan = new Car(cars_for_sale[i][0], cars_for_sale[i][4],
                                cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); //creation of car Object
                        elantraSedan.carDetails(); //calling method to print details
                        count = count +1;
                    }
                }
            }
            else if(myoption == 4)
            {
                int count = 1;
                for(int i = 0; i<cars_for_sale.length;i++)
                {
                    if(cars_for_sale[i][0] == "BMW") {
                        System.out.print(count);
                        Car elantraSedan = new Car(cars_for_sale[i][0], cars_for_sale[i][4],
                                cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); //creation of car Object
                        elantraSedan.carDetails(); //calling method to print details
                        count = count +1;
                    }
                }
            }    
            else
            {
                System.out.println("Invalid option, please try again");
            }
        }
        else
        {
            System.out.println("Invalid option please try again");
        }
    }
} 
        

    
        

