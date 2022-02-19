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
		
		System.out.println("Enter the price of the item:");
		inputPrice = kb.nextDouble();
		
		return inputPrice;
	}
	
	public static double tenderPrompt() {
		Scanner kb = new Scanner(System.in);
		double inputTender;
		
		System.out.println("Enter the amount tendered:");
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
		
		System.out.print("Give the customer back: ");
		
		while (change > 20.0) {
			twenties++;
			if (twenties > 1) {
				System.out.print(twenties + " twenties, ");	
			} else {
				System.out.print(twenties + " twenty, ");	
				
			}
		}
		
		change = change - (twenties * 20);
			
		while (change >= 10) {
			double changeTens = change % 10;
			tens++;
			change = change - (tens * 10);
			if (tens > 1) {
				System.out.print(tens + " tens, ");	
			} else {
				System.out.print(tens + " ten, ");	
				
			}
		
			
			
		}
			
		
		
		
		
		
	}
	
	
	
	
}
