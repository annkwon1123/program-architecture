class Coins {
	private int quaters;
	private int dimes;
	private int nickels;
	private int pennies;
	
	public Coins(int initial_amount) {
		if (initial_amount < 0) initial_amount = 0;
		int amount = initial_amount;
		quaters = amount/25;
		amount %= 25;
		dimes = amount/10;
		amount %= 10;
		nickels = amount/5;
		pennies = amount%5;
	}
	public Coins add(Coins other) {
		return new Coins(this.tocents() + other.tocents());
		
	}
	public int tocents() {
		return quaters*25 + dimes*10 + nickels*5 +pennies;
	}
}

class BankAccount {
	private Coins balance;
	
	public BankAccount(Coins initial_amount) {
		balance = initial_amount;
	}
	public Coins getBalance() {
		return balance;
	}
	public boolean deposit(Coins coins) {
		int amount = coins.tocents();
		boolean result = false;
		if (amount < 0)
			System.out.println("invalid deposit amount");
		else {
			balance = balance.add(coins);
			result = true;
		}
		return result;
	}
}
public class C1_Q5 {
	public static void main(String[] args) {
		Coins coins = new Coins(100);
		BankAccount account = new BankAccount(coins);
		account.deposit(coins);
		System.out.println("blance = " + account.getBalance().tocents());
	}
}
