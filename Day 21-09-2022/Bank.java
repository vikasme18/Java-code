package projecttype1;
import java.util.Scanner;

public class Bank {
	private int balance;
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("You have successfully deposited Rs" + amount);
	}
	
	public void withdraw(int amount) {
		if (this.balance >= amount) {
			System.out.println("Withdraw amount " + amount);
			balance -= amount;
		}
		else {
			System.out.println("Account does not have sufficient balance");
		}
	}
	
	public void display() {
		System.out.println("Your current balance is " + this.balance);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bank user1 = new Bank();
		char user_continue;
		do {
			System.out.print("Type 1 to deposit, 2 to withdraw or 3 to display your current balance: ");
			int user_request = scan.nextInt();
			
			switch(user_request) {
				case 1:
					System.out.print("How much money you want to deposit: ");
					int deposit_amount = scan.nextInt();
					user1.deposit(deposit_amount);
					break;
				case 2:
					System.out.print("How much money do you want to withdraw: ");
					int withdraw_amount = scan.nextInt();
					user1.withdraw(withdraw_amount);
					break;
				case 3:
					user1.display();
					break;
				default:
					System.out.println("Invalid");
					System.out.println("Please check the request");		
			}
			
			System.out.print("Type 'y' to continue using or 'n' to exit: ");
			user_continue = scan.next().charAt(0);
		} while(user_continue == 'y');
		
		scan.close();
	}
}
