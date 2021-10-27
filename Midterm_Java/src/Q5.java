
class BankAccount {
	
	private int balance;
	private int TRANSFER_FEE = 1;
	private boolean frozen = false; 
	
	public BankAccount(int initial_amount) {
		// fill here!
		if (initial_amount >= 0)
			balance = initial_amount;
		else
			balance = 0;
	}
	
	public boolean deposit(int amount) {
		// fill here!
		boolean result = false;
		if (frozen) return result;
		else if (amount < 0)
			System.out.println("invalid deposit error");
		else {
			balance += amount;
			result = true;
		}
		return result;
	}
	  
	public boolean withdraw(int amount) { 
		// fill here!
		boolean result = false;
		if (frozen) return result;
		else if (amount < 0)
			System.out.println("invalid withdraw error");
		else if (amount > balance)
			result = false;
		else {
			balance -= amount;
			result = true;
		}
		return result;
	}

	public boolean transfer(int amount, BankAccount other) {
		// fill here! 
		boolean result = false;
		if (this.frozen || other.frozen) return result;
		else if (this.withdraw(amount + TRANSFER_FEE)) {
			other.deposit(amount);
			result = true;
		}
		return result;
	}
	
	public void freeze() {
		// fill here!
		frozen = true;
	} 
	
	public boolean isFrozen() {
		// fill here!
		return frozen;
	}
	
	public int getBalance() {
		// fill here!
		return balance;
	}	
}

public class Q5 {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(100);
		BankAccount account2 = new BankAccount(10);
		System.out.println(account1.transfer(100, account2));  // false
		System.out.println(account1.transfer(95, account2));  // true 
		System.out.println("account 1: " + account1.getBalance()); // account 1: 4
		System.out.println("account 2: " + account2.getBalance()); // account 2: 105
		account2.freeze();
		System.out.println(account1.transfer(3, account2)); // false
		System.out.println("account 1: " + account1.getBalance()); // account 1: 4
		System.out.println("account 2: " + account2.getBalance()); // account 2: 105

	}

}
