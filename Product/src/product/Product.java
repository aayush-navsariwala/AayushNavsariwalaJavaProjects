package product;

import java.util.ArrayList;
import java.util.Scanner;

    //Class for product details
    public class Product {
    
    //Declaring variables
    private String prodCode;
    private String prodName;
    private String category;
    private String warranty;
    private double price;
    private int level;
    private String supplier;

    //Use of constructor
    public Product() {
        
    //Warranty of the product
    this.warranty = "2 years"; 
}
    //For the product code
    public String getProdCode() {
        return prodCode;
}

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
}
    //For the product name
    public String getProdName() {
        return prodName;
}

    public void setProdName(String prodName) {
        this.prodName = prodName;
}
    //For the product category
    public String getCategory() {
        return category;
}

    public void setCategory(String category) {
        this.category = category;
}
    //For the warranty which was set as 2 years
    public String getWarranty() {
        return warranty;
}

    public void setWarranty(String warranty) {
        if(warranty.equals("1"))
            this.warranty = "6 months";
}
    //For the price of the product
    public double getPrice() {
        return price;
}

    public void setPrice(double price) {
        this.price = price;
}

    public int getLevel() {
        return level;
}

    public void setLevel(int level) {
        this.level = level;
}
    //For the supplier
    public String getSupplier() {
        return supplier;
}

    public void setSupplier(String supplier) {
        this.supplier = supplier;
}

    @Override
    public String toString() {
        return "PRODUCT CODE >> \t" + prodCode + "\nPRODUCT NAME >> \t" + prodName + "\nPRODUCT CATEGORY >> \t" + category + "\nPRODUCT WARRANTY >> \t"
            + warranty + "\nPRODUCT PRICE >> \t" + price + "\nPRODUCT LEVEL >> \t" + level + "\nPRODUCT SUPPLIER >> \t" + supplier ;
}
      
}

    //Class for Report data
    class ReportData {

    //List of products
    private ArrayList<Product> products ;
    
    //Array for the categories
    private String[] categories;

    //Declaring the categories
    public ReportData() {
        this.categories = new String[] {"Desktop Computer", "Laptop", "Tablet", "Printer", "Gaming console"};
            products = new ArrayList<>();
}
  
    //To add new products to the list
    void addProduct(Scanner in) {
    System.out.println("CAPTURE A NEW PRODUCT");
    
    System.out.println("**********************");

    Product newProduct = new Product();

    System.out.print("Enter the product code: ");

    newProduct.setProdCode(in.nextLine());

    System.out.print("Enter the product name: ");

    newProduct.setProdName(in.nextLine());

    System.out.println("Enter the product category: ");
    int choice;

    //The loop for category selection
    while (true) {
        for (int i = 0; i < categories.length; i++) {
            System.out.println(categories[i] + " - " + (i + 1));
}
        
    System.out.print("Product category: ");
        try{
    choice = Integer.parseInt(in.nextLine());
        if(choice>0 && choice<=categories.length)

            break;
}

        catch(NumberFormatException e){
            System.out.println("Incorrect category selection..");
}
}
    
    newProduct.setCategory(categories[choice-1]);
        
    setWarranty(newProduct, in);
        
    setPrice(newProduct, in);
        
    setStockLevel(newProduct, in);

        System.out.print("Enter supplier for "+newProduct.getProdName()+": ");

        newProduct.setSupplier(in.nextLine());
        products.add(newProduct);
            System.out.println("Product details has been saved successfully!!!\n");
}

    //Method to set stock level of a product
    private void setStockLevel(Product newProduct, Scanner in) throws NumberFormatException {
        System.out.print("Enter stock level for "+newProduct.getProdName()+": ");
            newProduct.setLevel(Integer.parseInt(in.nextLine()));
}

    //Method to set price of a product
    private void setPrice(Product newProduct, Scanner in) throws NumberFormatException {
        System.out.print("Enter price for "+newProduct.getProdName()+": ");
            newProduct.setPrice(Double.parseDouble(in.nextLine()));
}

    //Method to set warranty of a product
    private void setWarranty(Product newProduct, Scanner in) {
        System.out.print("Indicate product warranty. Enter (1) for 6 months or any other keys for 2 years: ");
            newProduct.setWarranty(in.nextLine());
}

    //Method to search a product in the products list
    Product searchProduct(Scanner in) {
        System.out.println("Please enter product code: ");
        String prodCode = in.nextLine();
            System.out.println("\nPRODUCT SEARCH RESULT");
                System.out.println("***************************");
            for(int i=0; i<products.size(); i++){
                if(products.get(i).getProdCode().equals(prodCode)){
    return products.get(i);
}
}
    return null;
}

    //Method to update details of product
    void update(Scanner in) {
    Product p = searchProduct(in);
        if(p!=null){
            System.out.print("Update the warranty? (y)yes (n)no: ");
    
    String choice = in.nextLine();
        if(choice.equalsIgnoreCase("y")){
            setWarranty(p, in);
}

    System.out.print("Update the price? (y)yes (n)no: ");
        choice = in.nextLine();
            if(choice.equalsIgnoreCase("y")){
                setPrice(p, in);
}

    System.out.print("Update the stock level? (y)yes (n)no: ");
        choice = in.nextLine();
            if(choice.equalsIgnoreCase("y")){
                setStockLevel(p, in);
}

            System.out.println("The product details has been updated successfully!!!");
}
    else{

            System.out.println("The product canot be located. Invalid product.");
}
}

    //Method to delete a product
    void delete(Scanner in) {
    Product p = searchProduct(in);
        if(p!=null){
            System.out.print("Do you want to delete "+p.getProdCode()+"? (y)yes (n)no: ");
        String choice = in.nextLine();
            if(choice.equalsIgnoreCase("y")){
                products.remove(p);
                    System.out.println(p.getProdCode() +" deleted.");
}
  
}
    else{

            System.out.println("The product canot be located. Invalid product.");
}
}

    //Method to display report
    void report() {
    double total = 0;
    System.out.println("PRODUCT REPORT");
        System.out.println("*************************************************");
    for(int i=0; i<products.size(); i++){
    System.out.println("PRODUNT "+(i+1));
        System.out.println("--------------------------------------------------");
            System.out.println(products.get(i));
        total += products.get(i).getPrice();
            System.out.println("--------------------------------------------------");
}
    System.out.println("TOTAL PRODUCT COUNT: "+products.size());
        System.out.println("TOTAL PRODUCT VALUE: R "+total);
            System.out.printf("TOTAL PRODUCT VALUE: R %.2f",total/products.size());
}

}
    //class for application with main method
    class Application {
  
    static ReportData newReport;

    public static void main(String[] args) {
    
    //Scanner object for reading input
    Scanner in = new Scanner(System.in);

    //Object for ReportData
    newReport = new ReportData();
    
    //Loop for welcome message
    while (true) {
    showWelcomeMessage();
    String choice = in.nextLine();
    if (!choice.equals("1")) {
        break;
}
    //Loop for mrnu
    while (true) {
        showMenu();
            choice = in.nextLine();
        if(choice.equals("6"))
            break;
        switch(choice){
    case "1":
    newReport.addProduct(in);
        break;

    case "2":
    Product p = newReport.searchProduct(in);
    if( p!= null)
        System.out.println(p);
    else
        System.out.println("The product cannot be located. You have entered an invalid product code.");
    break;
    
    case "3":
    newReport.update(in);
    break;

    case "4":
    newReport.delete(in);
    break;

    case "5":
    newReport.report();
    break;
    
    default:
        System.out.println("Invalid entry...");
}
}
}
}

    //Method to display welcome message
    private static void showWelcomeMessage() {
        System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION");
        System.out.println("**************************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");
}

    //Method to display menu
    private static void showMenu() {
        System.out.println("\nPlease select one of the menu item: ");
        System.out.println("(1). Capture a new product");
        System.out.println("(2). Search for a product");
        System.out.println("(3). Update a product");
        System.out.println("(4). Delete a product");
        System.out.println("(5). Print report");
        System.out.println("(6). Exit application");
}
}

    
