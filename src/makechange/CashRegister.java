package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		double itemPrice = pricePrompt();
		double amountTendered = tenderPrompt();

		if (amountTendered == itemPrice) {
			exactChange();
		}

		else if (amountTendered < itemPrice) {
			underPay();
		}

		else {
			overPay(itemPrice, amountTendered);
		}
	}

	public static double pricePrompt() {
		Scanner kb = new Scanner(System.in);
		double inputPrice;

		System.out.println("Amount:");
		inputPrice = kb.nextDouble();

		return inputPrice;
	}

	public static double tenderPrompt() {
		Scanner kb = new Scanner(System.in);
		double inputTender;

		System.out.println("Tendered:");
		inputTender = kb.nextDouble();

		return inputTender;
	}

	public static void exactChange() {
		System.out.println("The customer paid with the exact amount, no change needed.");
	}

	public static void underPay() {
		System.out.println("The customer did not pay enough for the item.");
	}

	public static void overPay(double price, double tendered) {

		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;

		double change = tendered - price;

		System.out.print("Result: ");

		while (change > 20.0) {
			twenties++;
			change = change - (twenties * 20);
		}
		while (change >= 10) {
			tens++;
			change = change - (tens * 10);
		}
		while (change >= 5) {
			fives++;
			change = change - (fives * 5);
		}
		while (change >= 1) {
			ones++;
			change = change - (ones);
		}
		

		if (twenties > 1) {
			System.out.print(twenties + " twenties, ");
		} else if ( twenties == 1){
			System.out.print(twenties + " twenty, ");
//		} else {
//			System.out.println("");
		}
		if (tens > 1) {
			System.out.print(tens + " tens, ");
		} else if (tens == 1){
			System.out.print(tens + " ten, ");
		}
		
		if (fives > 1) {
			System.out.print(fives + " fives, ");
		} else if (fives == 1){
			System.out.print(fives + " five, ");
		}
		
		if (ones >= 1) {
			System.out.print(ones + " ones, ");
		} else if (ones == 1){
			System.out.print(ones + " one, ");
		}

	}

}
