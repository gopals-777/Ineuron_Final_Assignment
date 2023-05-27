package in.grs.main;

import java.util.Scanner;

class BankAccountSimulation {
    private String accountNumber;
	private String accountHolder;
    private double balance;

	public BankAccountSimulation(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
		System.out.println("Deposit successful. Current balance: " + balance);
    }

    public void withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("Withdrawal successful. Current balance: " + balance);
		} else {
			System.out.println("Insufficient funds. Current balance: " + balance);
        }
    }

    public void checkBalance() {
		System.out.println("Current balance: " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

		System.out.print("Enter account holder name: ");
		String accountHolder = scanner.nextLine();

		BankAccountSimulation account = new BankAccountSimulation(accountNumber, accountHolder);

        while (true) {
			System.out.println("\n*******Ineuron Bank Account Menu:*******");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
            System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
					System.out.print("Enter the amount to deposit: ");
					double depositAmount = scanner.nextDouble();
					account.deposit(depositAmount);
                    break;
                case 2:
					System.out.print("Enter the amount to withdraw: ");
					double withdrawAmount = scanner.nextDouble();
					account.withdraw(withdrawAmount);
                    break;
                case 3:
					account.checkBalance();
                    break;
                case 4:
					System.out.println("Exiting the program. Goodbye!\n Thanks for using Application!!!");
					System.exit(0);
				default:
					System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
