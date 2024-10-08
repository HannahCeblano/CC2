//Hannah Marielle O. Ceblano 
//CITCS 1N-A
//September 12, 2024
//Laboratory 4


import java.util.Scanner;

public class Lab5Resturant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        int quantity;
        double total = 0;
        
        do {
            // Display the menu options
            System.out.println("Menu");
            System.out.println("1. Burger       -PHP 100");
            System.out.println("2. Fries        -PHP 50");
            System.out.println("3. Soda         -PHP 30");
            System.out.println("4. Ice cream    -PHP 45");
            System.out.println("5. Exit");
            System.out.println("Enter the menu item number: ");
            choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Thank you for your order");
                break;
            }
            // Process the order if the user chooses an item between 1 and 4
            if(choice >= 1 && choice <= 4) {
                // Ask the user to enter the quantity
                System.out.print("Enter quantity: ");
                quantity = scanner.nextInt();
                
                switch (choice) {
                    case 1: 
                        total = 100 * quantity; // Calculate total for Burger
                        System.out.print("You Ordered " + quantity + " Burger");
                        break;
                    case 2:
                        total = 50 * quantity; // Calculate total for Fries
                        System.out.print("You Ordered " + quantity + " Fries");
                        break;
                    case 3:
                        total = 30 * quantity; // Calculate total for Soda
                        System.out.print("You Ordered " + quantity + " Soda");
                        break;
                    case 4:
                        total = 45 * quantity; // Calculate total for Ice Cream
                        System.out.print("You Ordered " + quantity + " Ice Cream");
                        break;
                 }
                 // Print the total bill for the selected item
                 System.out.println("\nTotal Bill: PHP " + total);
            }
        } while (choice != 5);
    }
}
