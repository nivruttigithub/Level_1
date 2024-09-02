//Write a Java program to create a class called "BankAccount" with instance variables 
//"balance" and "accountNumber." Include a method to deposit money into the account 
//and a method to withdraw money from the account.

//Using Encapsulation

package level_1;

public class BankAccount {

	private int balance;
	private int accountNumber;

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getAccountNumber() {
		return this.accountNumber;
	}

	public void depositMoney(int amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Diposited Amount :" + amount);
		} else {
			System.out.println("Diposited amount must be Positive..!");
		}
	}

	public void withdrawMoney(int amount) {
		if (amount > 0) {
			if (balance >= amount) {
				balance = balance - amount;
				System.out.println("WithDraw Amount is : " + amount);
			} else {
				System.out.println("Insufficient Balance...!");
			}
		} else {
			System.out.println("WithDrawal Amount must be Positive...!");
		}

	}

	public static void main(String args[]) {
		BankAccount ba = new BankAccount();
		ba.setBalance(500);
		ba.setAccountNumber(91301230);
		System.out.println("Balance is :" + ba.balance);
		ba.getBalance();
		ba.getAccountNumber();
		ba.depositMoney(200);
		ba.withdrawMoney(300);
		System.out.println("Remaining Balance : " + ba.balance);
	}

}
