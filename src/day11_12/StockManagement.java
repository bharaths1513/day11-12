package day11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class StockManagement {

	ArrayList<stock> stockmanagement = new ArrayList<>();
	int totalStockPrice;
	static Scanner scanner = new Scanner(System.in);

	void addStocks() {

		System.out.println("Enter How many stock you want to add:");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the values of Stock Number " + i);
			System.out.println("Enter the share Name ");
			String shareName = scanner.next();
			System.out.println("Enter the Number of share");
			int numOfShare = scanner.nextInt();
			System.out.println("Enter the Price of Each Share");
			int priceOfShare = scanner.nextInt();
			stock stock = new stock(shareName, numOfShare, priceOfShare);
			totalStockPrice += stock.valueOfStock();
			stockmanagement.add(stock);

		}
	}

	void displayStock() {
		for (stock stock : stockmanagement) {
			System.out.println(stock);
		}
	}

	public static void main(String[] args) {
		int choice = 0;
		StockManagement o = new StockManagement();
		while (choice != 4) {

			System.out.println("Welcome to the Menu Of stock Managment");
			System.out.println("1)Add Stock");
			System.out.println("2)View Stock Report of Each Stock");
			System.out.println("3)View Total Stock Amount");
			System.out.println("4)Exit");

			choice = scanner.nextInt();
			if (choice == 1) {
				o.addStocks();
			} else if (choice == 2) {
				o.displayStock();
			} else if (choice == 3) {
				System.out.println("Total Stock Price is " + o.totalStockPrice);

			}

		}

	}
}
