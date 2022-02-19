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
		double change = price - tendered;
		
		int twenties;
		int tens;
		int fives;
		int ones;
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		
		
		
		
	}
	
	
	
}
