package Bank;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> doubleArrayList;


    public Customer(String name) {
        this(name,0.0);
        //doubleArrayList = new ArrayList<Double>();

    }


    public Customer(String name, double initialAmount) {
        this.name = name;
        doubleArrayList = new ArrayList<Double>();
        this.doubleArrayList.add(Double.valueOf(initialAmount));
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public void addDoubleArrayList(double transition){
        this.doubleArrayList.add(Double.valueOf(transition));
   }


   public void displayTransition(){

       System.out.println("Find " + doubleArrayList.size() + " record");
       for (int i = 0; i < doubleArrayList.size(); i ++ ){
           System.out.println((i+1) + ". " + doubleArrayList.get(i).doubleValue() );
       }

   }

    public static Customer setCustomer(String name , double initialAmount){
        return new Customer(name , initialAmount);
    }




}

// You job is to create a simple banking application.
// There should be a Bank class

// It should have an arraylist of Branches

// Each Branch should have an arraylist of Customers



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
