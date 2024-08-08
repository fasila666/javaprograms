package classwork4;

class Bank_Account {
    // Private instance variables
    private String account_Number;
    private double balance;
    
    // Constructor
    public Bank_Account(String account_Number, double balance) {
        this.account_Number = account_Number;
        this.balance = balance;
    }

    public String getAccount_Number() {
        return account_Number;
    }

    public void setAccount_Number(String account_Number) {
        this.account_Number = account_Number;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void displayAccountDetails() {
        System.out.println("Account Number: " + account_Number);
        System.out.println("Balance: $" + balance);
    }
}

public class Bankaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Bank_Account account = new Bank_Account("123456789", 1000.00);
	        
	        // Displaying initial account details
	        account.displayAccountDetails();
	        
	        // Modifying account details using setter methods
	        account.setAccount_Number("987654321");
	        account.setBalance(2000.00);
	        
	        // Displaying updated account details
	        account.displayAccountDetails();
			}
	}


