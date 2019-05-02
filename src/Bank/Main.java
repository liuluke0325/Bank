package Bank;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        Bank myBank = new Bank("Bank of Luke");
        String branchName;
        boolean flag = true;
        do {
            displayMenu();
            System.out.println("\tPlease enter number:  ");
            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select ){

                case 1:
                    System.out.print("Please enter the branch name: ");
                    branchName = scanner.nextLine();
                    myBank.addBranches(branchName);
                    break;

                case 2 :
                    System.out.print("Please enter the branch name: ");
                    branchName = scanner.nextLine();
                    myBank.branchSystem( myBank.searchBranchIndex(branchName));
                    break;
                case 3:
                    myBank.displayAllBranches();
                    break;
                case 0:
                    System.out.println("Closing the system");
                    flag = false;
                    break;
                default:
                    System.out.println("Please enter the correct number");
                    break;




            }

        }while(flag == true);


    }  // end of main

    public static void displayMenu(){
        System.out.println("----------------Bank System-----------------");
        System.out.println("1. Add a Branches");
        System.out.println("2. Go to branch");
        System.out.println("3. Display all the branch");
        System.out.println("0. Close the System");
        System.out.println("--------------------------------------------");
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
