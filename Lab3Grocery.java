//Hannah Marielle O. Ceblano 
//CITCS 1N-A
//September 12, 2024
//Laboratory No.3


import java.util.Scanner;

public class Lab3Grocery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Accepts an int input to set the price and quantity of item
        System.out.print("Enter price of item 1: ");
        double price1 = scan.nextDouble();
        System.out.print("Enter quantity of item 1: ");
        int quantity1 = scan.nextInt();
        
        //Accepts an int input to set the price and quantity of second item
        System.out.print("Enter price of item 2: ");
        double price2 = scan.nextDouble();
        System.out.print("Enter quantity of item 2: ");
        int quantity2 = scan.nextInt();
        
        //Accepts an int input to set the price and quantity of third item
        System.out.print("Enter price of item 3: ");
        double price3 = scan.nextDouble();
        System.out.print("Enter quantity of item 3: ");
        int quantity3 = scan.nextInt();
        
        //Calculates the sub total,discount,salestax, and final total
        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3 );
        double discount = subtotal * 0.05;
        double salestax = (subtotal - discount) * 0.12;
        double finaltotal = (subtotal -  discount) + salestax;
        
        //Prints the sub total,discount,salestax, and finaltotal
        System.out.println("\nSubtotal: "+subtotal);
        System.out.println("Diacount: "+discount);
        System.out.println("Sales Tax: "+salestax);
        System.out.println("Total: "+finaltotal);
        
        
        
       
        
        
        

    
    
    }
}

