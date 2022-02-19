package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		double itemPrice = pricePrompt(kb);
		double amountTendered = tenderPrompt(kb);

		
		if (amountTendered == itemPrice) {
			exactChange();
		} else if (amountTendered < itemPrice) {
			underPay();
		} else {
			overPay(itemPrice, amountTendered);
		}
		
		kb.close();
	}

	public static double pricePrompt(Scanner kb) {
		double inputPrice;

		System.out.println("Amount:");
		inputPrice = kb.nextDouble();

		return inputPrice;
	}

	public static double tenderPrompt(Scanner kb) {
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

		System.out.println("Result: ");

		while (change >= 20) {
			twenties++;
			change -= 20;
		}
		while (change >= 10) {
			tens++;
			change -= 10;
		}
		while (change >= 5) {
			fives++;
			change -= 5;
		}
		while (change >= 1) {
			ones++;
			change -= 1;
		}
		
		change += 0.005;
		
		while (change >= .25) {
			quarters++;
			change -= .25;
		}
		while (change >= .10) {
			dimes++;
			change -= .10;
		}
		while (change >= .05) {
			nickels++;
			change -= .05;
		}
		while (change >= .01) {
			pennies++;
			change -= .01;
		}

		if (twenties > 1) {
			System.out.println(twenties + " twenties");
		} else if ( twenties == 1){
			System.out.println(twenties + " twenty");
		}
		if (tens > 1) {
			System.out.println(tens + " tens");
		} else if (tens == 1){
			System.out.println(tens + " ten");
		}
		
		if (fives > 1) {
			System.out.println(fives + " fives");
		} else if (fives == 1){
			System.out.println(fives + " five");
		}
		
		if (ones > 1) {
			System.out.println(ones + " ones");
		} else if (ones == 1){
			System.out.println(ones + " one");
		}
		
		if (quarters > 1) {
			System.out.println(quarters + " quarters");
		} else if (quarters == 1) {
			System.out.println(quarters + " quarter");
		}
		
		if (dimes > 1) {
			System.out.println(dimes + " dimes");
		} else if (dimes == 1) {
			System.out.println(dimes + " dime");
		}
		
		if (nickels > 1) {
			System.out.println(nickels + " nickels");
		} else if (nickels == 1) {
			System.out.println(nickels + " nickel");
		}
		
		if (pennies > 1) {
			System.out.println(pennies + " pennies");
		} else if (pennies == 1) {
			System.out.println(pennies + " penny");
		} 

	}

}
