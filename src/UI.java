package src;

import src.Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UI {
    private Controller controller;

    public UI(Controller controller) {
        this.controller = controller;
    }

    public void RUN() throws IOException {
        System.out.println("Welcome to the APP");
        System.out.println("Your options are: ");
        System.out.println("1. Add Customer: ");
        System.out.println("2. Show Customer: ");
        System.out.println("3. Delete Customer: ");
        System.out.println("4. Show All Customers: ");
        System.out.println("5. Update Customer: ");
        System.out.println("6. Add Product: ");
        System.out.println("7. Show Product: ");
        System.out.println("8. Delete Product: ");
        System.out.println("9. Show All Products: ");
        System.out.println("10. Update Product: ");
        System.out.println("11. Give a new product for a customer: ");
        System.out.println("12. Sort Customers by location");
        System.out.println("13. Filter Customers by a product with a user-specified season");
        System.out.println("14. Sort all the bought products of a user-specified customer and " +
                "The sort method");
        System.out.println("0. Exit");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String choice;

        while (true) {

            System.out.println("\nPlease select an option: ");
            choice = reader.readLine();
            int intChoice = Integer.parseInt(choice);

            switch (intChoice) {
                case 1: {
                    addNewCustomer();
                    break;
                }
                case 2: {
                    showACustomerByitsID();
                    break;
                }
                case 3: {
                    deleteCustomerByID();
                    break;
                }
                case 4: {
                    showAllCustomers();
                    break;
                }
                case 5: {
                    updateCustomer();
                    break;
                }
                case 6: {
                    addNewProduct();
                    break;
                }
                case 7: {
                    showAProductByItsID();
                    break;
                }
                case 8: {
                    deleteProduct();
                    break;
                }
                case 9: {
                    showAllProducts();
                    break;
                }
                case 10: {
                    updateProduct();
                    break;
                }
                case 11: {
                    addAProductToACustomer();
                    break;
                }
                case 12: {
                    sortCustomersByLocation();
                    break;
                }
                case 13: {
                    filterCustomerSeason();
                    break;
                }
                case 14: {
                    allProductsOfACustomerSorted();
                    break;
                }
                case 0: {
                    System.out.println("Thank you for using our app");
                    System.exit(0);
                }
            }
        }
    }

    public void addNewCustomer() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the ID of the customer: ");
        int customerID = Integer.parseInt(reader.readLine());
        System.out.println("Please enter the name of the customer: ");
        String name = reader.readLine();
        System.out.println("Please enter the location of the customer: ");
        String location = reader.readLine();
        controller.addPatienten(patientenID, name, alter, diagnose);
    }

    public void showACustomerByitsID() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the ID of the customer: ");
        int customerID = Integer.parseInt(reader.readLine());
        System.out.println(controller.getCustByID(customerID));
    }

    public void deleteCustomerByID() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the ID of the customer: ");
        int customerID = Integer.parseInt(reader.readLine());
        controller.deleteCustomer(customerID);
    }
    public void showAllCustomers() throws IOException {
        List<Customer> customers = controller.getAllCustomers();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
    public void updateCustomer() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the ID of the customer: ");
        int customerID = Integer.parseInt(reader.readLine());
        System.out.println("Please enter the name of the customer: ");
        String name = reader.readLine();
        System.out.println("Please enter the location of the customer: ");
        String location = reader.readLine();
        controller.updateCustomer(customerID, name, location);
    }
    public void addNewProduct() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the ID of the product: ");
        int productID = Integer.parseInt(reader.readLine());
        System.out.println("Please enter the name of the product: ");
        String productName = reader.readLine();
        System.out.println("Please enter the price of the product: ");
        double price = Double.parseDouble(reader.readLine());
        System.out.println("Please enter the season of the product: ");
        String season = reader.readLine();
        controller.addProduct(productID, productName, price, season);
    }
    public void showAProductByItsID() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the ID of the product: ");
        int productID = Integer.parseInt(reader.readLine());
        System.out.println(controller.getProByID(productID));
    }
    public void deleteProduct() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the ID of the product: ");
        int productID = Integer.parseInt(reader.readLine());
        controller.deleteProduct(productID);
    }
    public void showAllProducts() throws IOException {
        List<Product> products = controller.getAllProducts();
        for (Product product : products) {
            System.out.println(product);
        }
    }
    public void updateProduct() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the ID of the product: ");
        int productID = Integer.parseInt(reader.readLine());
        System.out.println("Please enter the name of the product: ");
        String productName = reader.readLine();
        System.out.println("Please enter the price of the product: ");
        double price = Double.parseDouble(reader.readLine());
        System.out.println("Please enter the season of the product: ");
        String season = reader.readLine();
        controller.updateProduct(productID, productName, price, season);
    }
    public void addAProductToACustomer() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("All available customers:\n");
        showAllCustomers();
        System.out.println("Please enter the ID of the customer you wanna sell something: ");
        int customerID = Integer.parseInt(reader.readLine());
        System.out.println("All products:\n");
        showAllProducts();
        System.out.println("Please enter the ID of the product you wanna sell: ");
        int productID = Integer.parseInt(reader.readLine());
        controller.sellItem(customerID,productID);
    }
    public void sortCustomersByLocation() throws IOException {
        List<Customer> customers = controller.getAllCustomers();
        List<Customer> customersWithRequiredLocation = new ArrayList<Customer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the location: ");
        String location = reader.readLine();
        for (Customer customer : customers) {
            if (customer.getPlace().equalsIgnoreCase(location))
                customersWithRequiredLocation.add(customer);
        }

        for (Customer customer : customersWithRequiredLocation) {
            System.out.println(customer);
        }
    }

    public void filterCustomerSeason() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Customer> customers = controller.getAllCustomers();
        List<Customer> customersWithSeason = new ArrayList<Customer>();
        System.out.println("Please enter the season: ");
        String season = reader.readLine();
        for (Customer customer : customers) {
            for (Product product : customer.getProducts()) {
                if(product.getSeason().equalsIgnoreCase(season))
                    customersWithSeason.add(customer);
            }
        }
        for (Customer customer : customersWithSeason) {
            System.out.println(customer);
        }
    }

    public void allProductsOfACustomerSorted() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Customer> customers = controller.getAllCustomers();
        System.out.println("All customers: \n");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        System.out.println("Please enter the ID of the customer you wanna see the items: ");
        int customerID = Integer.parseInt(reader.readLine());
        Customer customer = controller.getCustByID(customerID);

        List<Product> products = customer.getProducts();
        System.out.println("How do you want to see the items? (1 - Ascending, 2 - Descending)");
        int sortMethode = Integer.parseInt(reader.readLine());
        switch (sortMethode) {
            case 1:{
                products.sort(Comparator.comparingDouble(Product::getPrice));
                break;
            }
            case 2:{
                products.sort((p1,p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
                break;
            }
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }

}

