package cases;
import java.util.Scanner;

public class atm {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double balance = 10000.00;  // Initial balance
	        int choice;

	        while (true) {
	            System.out.println("\n===== ATM MENU =====");
	            System.out.println("1. Withdraw Cash");
	            System.out.println("2. Deposit Cash");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = sc.nextDouble();
	                    if (withdrawAmount <= balance) {
	                        balance -= withdrawAmount;
	                        System.out.println("Please collect your cash.");
	                    } else {
	                        System.out.println("Insufficient balance.");
	                    }
	                    break;

	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = sc.nextDouble();
	                    balance += depositAmount;
	                    System.out.println("Amount deposited successfully.");
	                    break;

	                case 3:
	                    System.out.println("Current balance: ₹" + balance);
	                    break;

	                case 4:
	                    System.out.println("Thank you for using the ATM.");
	                    System.exit(0);  // Exit the program
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}



