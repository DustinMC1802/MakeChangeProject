package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		
		double itemPrice = pricePrompt();
		double amountTendered = tenderPrompt();
		
		
		exactChange();
		underPay();
		overPay();
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
		
	}
	
	public static void underPay() {
		
	}
	
	public static void overPay() {
		
	}
	
	
	
}
