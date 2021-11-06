package day11_12;

import java.util.Scanner;

public class AccountTest {

	int Account_Balance = 10000;
	int debit;
	int Balance;

	void debit() {

		Scanner o = new Scanner(System.in);
		System.out.println("Enter the Amount");
		debit = o.nextInt(); // user input to assign the debit value at run time
		if (debit > 0 && debit < Account_Balance) {
			Balance = Account_Balance - debit;
			System.out.println("The debited amount is: " + debit);
			System.out.println("Account Balance after debit: " + Balance);

		} else if (debit < 0) { // if user gave invalid input
			System.out.println("Entered amount is not valied");
			System.out.println("Account Balance: " + Account_Balance);

		} else { // if user assign more the account balance value
			System.out.println("Low Account Balance");
			System.out.println("Account Balance: " + Account_Balance);
		}

	}

	public static void main(String[] args) {
		AccountTest n = new AccountTest();
		n.debit();
	}

}
