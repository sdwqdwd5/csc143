package cardInfo;

public class student {
	
	private String name;
	private int balance = 100;
	public int a;
	//balance = 100;
	
	public student(String name) {
		this.name = name;
	}
	
	public student(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	
	public int lunchitem(String food){
		if (food == "burger") {
			return 30;
		}else if (food == "sandwich") {
			return 20;
		}else if (food == "coffee") {
			return 15;
		}else if (food == "pizza") {
			return 15;
		}else if (food == "water") {
			return 10;
		}
		return 0;
		}
	public void purchaseItem(String item) {
		balance -= lunchitem(item);
		if (balance < 0) {
			System.out.println("Your balance is not enough to purchase the item.");
		}else {
			System.out.println("You purchase a "+ item + ","
					+ " your balance now is " + balance +".");
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addBalance(int balance) {
		this.balance += balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "Name: " + name + "\n" 
				+ "balance: " + balance;
	}
}