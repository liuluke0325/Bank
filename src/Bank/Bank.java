package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<Branches> branchesArrayList ;
    private String bankName;


    public Bank(String bankName) {
//        System.out.println("Please enter the name of bank");
        this.bankName = bankName;

        branchesArrayList = new ArrayList<Branches>();
//        System.out.println("Please enter the first branch name for "+this.bankName + " : ");
//        String branchName = scanner.nextLine();
//        branchesArrayList.add(new Branches(branchName));
    }


    public boolean addBranches(String name){
        if (searchBranchIndex(name) >=0){
            System.out.println("Error: Same Branch in the bank");
            return false;
        }

        branchesArrayList.add(new Branches(name));
        System.out.println("Successful add a new Branch " + name);
        return true;

    }

    public void displayAllBranches(){

        System.out.println("Find " + branchesArrayList.size() + " Branch");
        for (int i = 0; i < branchesArrayList.size(); i ++ ){
            System.out.println((i+1) + ". " + branchesArrayList.get(i).getBranchName() + " Branch");
        }

    }



    public int searchBranchIndex(String branchName){
        int index = -1; // assume not found
        for (int i=0; i<branchesArrayList.size(); i++){
            if (branchesArrayList.get(i).getBranchName().equals(branchName)){
                index = i;
            }
        }
        return index;
    }

    public void branchSystem(int index){
        boolean flag = true;
        String customerName ;
        do {
            System.out.println("You are now in " + branchesArrayList.get(index).getBranchName() +" System");
            branchMenu();
            System.out.println("\tPlease enter number:  ");
            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select ){

//                case 1:
//                    System.out.print("Please enter the customer name: ");
//                    customerName = scanner.nextLine();
//                    .addBranches(customerName);
//                    break;
//
//                case 2 :
//                    System.out.print("Please enter the branch name: ");
//                    customerName = scanner.nextLine();
//                    myBank.searchBranchIndex()
//                    break;
//                case 3:
//                    myBank.displayAllBranches();
//                    break;break
                case 0:
                    System.out.println("Go Back to the Bank System ");
                    flag = false;
                    break;
                default:
                    System.out.println("Please enter the correct number");
                    break;
            }

        }while(flag == true);
    }

    private void branchMenu(){
        System.out.println("--------------------------------------------");
        System.out.println("1. Add a Customer");
        System.out.println("2. Go to one Customer");
        System.out.println("3. Display all the customer");
        System.out.println("0. Back to Bank System");
        System.out.println("--------------------------------------------");


    }





} // end of Bank class



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