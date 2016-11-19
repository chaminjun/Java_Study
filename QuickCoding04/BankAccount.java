
public class BankAccount {
	
	private int balance = 100;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withDraw(int amount) {
		balance -= amount;
		System.out.println("총합 : " +balance + " " + amount + " 만큼 출금");
	}
	
	public synchronized void deposit(int money) { 
		balance += money;
		System.out.println("총합 : " + balance + " " + money + " 만큼 입금");
	}
	
}
