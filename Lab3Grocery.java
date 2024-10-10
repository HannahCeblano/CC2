//Hannah Marielle O. Ceblano
//CITCS 1N-A
//September 12, 2024
//Laboratory No.3


import java.util.Scanner;

public class Lab3Grocery {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double subtotal,discount,salestax,finaltotal,price1,price2,price3;

		//Accepts an int input to set the price and quantity of item
		System.out.print("Enter price of item 1: ");
		price1 = scan.nextDouble();
		System.out.print("Enter quantity of item 1: ");
		int quantity1 = scan.nextInt();

		//Accepts an int input to set the price and quantity of second item
		System.out.print("Enter price of item 2: ");
		price2 = scan.nextDouble();
		System.out.print("Enter quantity of item 2: ");
		int quantity2 = scan.nextInt();

		//Accepts an int input to set the price and quantity of third item
		System.out.print("Enter price of item 3: ");
		price3 = scan.nextDouble();
		System.out.print("Enter quantity of item 3: ");
		int quantity3 = scan.nextInt();

		//Calculates the sub total,discount,salestax, and final total
		subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3 );
		discount = subtotal * 0.05;
		salestax = (subtotal - discount) * 0.12;
		finaltotal = (subtotal -  discount) + salestax;

		//Prints the sub total,discount,salestax, and finaltotal
		System.out.printf("Subtotal: "+subtotal);
		System.out.printf("\nDiscount: "+discount);
		System.out.printf("\nSales Tax: "+salestax);
		System.out.printf("\nTotal: "+finaltotal);










	}
}
