package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		double itemPrice = 0.0;
		double amountTendered = 0.0;
		
		pricePrompt();
		tenderPrompt();
		
		
		exactChange();
		underPay();
		overPay();
	}

	public static double pricePrompt() {
		Scanner kb = new Scanner(System.in);
		double inputPrice;
		
		System.out.println("Enter the price of the item :");
		inputPrice = kb.nextDouble();
		
		return inputPrice;
	}
	
	public static void tenderPrompt() {
		
	}
	
	public static void exactChange() {
		
	}
	
	public static void underPay() {
		
	}
	
	public static void overPay() {
		
	}
	
	
	
}
