package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Branches {

    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<Customer> customerArrayList;
    private String branchName;

    public Branches(String branchName) {
        this.branchName = branchName;
        this.customerArrayList = new ArrayList<Customer>();
    }



    public void displayAllCustomer(){

        System.out.println("Find " + customerArrayList.size() + " customer");
        for (int i = 0; i < customerArrayList.size(); i ++ ){
            System.out.println((i+1) + ". " + customerArrayList.get(i).getName() );
        }

    }


    public boolean addCustomer(String name, double initialAmount ){

        if (searchCustomerIndex(name) >=0){
            System.out.println("Error: Same Customer in the branch");
            return false;
        }

        customerArrayList.add(new Customer(name, initialAmount));
        System.out.println("Successful add a new Customer " + name +" with initial Amount "+ initialAmount);
        return true;
    }

    public boolean addCustomer(String name){
        System.out.print("Please enter the initial amount");
        double initialAmount = scanner.nextDouble();
        scanner.nextLine();
        return addCustomer(name, initialAmount);
    }

    public boolean Transaction(String customerName){
        int index = searchCustomerIndex(customerName);

        if (index < 0){
            System.out.println("Error: Can not find the customer");
            return false;
        }
        System.out.println("Please enter the transition amount: ");
        double amount = scanner.nextDouble();
        customerArrayList.get(index).addDoubleArrayList(amount);
        return true;
    }



    public int searchCustomerIndex(String customerName){
        int index = -1; // assume not found
        for (int i=0; i<customerArrayList.size(); i++){
            if (customerArrayList.get(i).getName().equals(customerName)){
                index = i;
            }
        }
        return index;
    }


    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }


    public boolean displayCustomerTransition(String customerName){
        int index = searchCustomerIndex(customerName);
        if (index < 0){
            System.out.println("Error: Can not find the customer");
            return false;
        }

        customerArrayList.get(index).displayTransition();
        return true;

    }














} // end of class


// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers

// The Customer class should have an arraylist of Doubles (transactions)

// Customer:
// Name, and the ArrayList of doubles.

// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch



// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch


// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions
