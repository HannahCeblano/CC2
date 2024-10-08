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
            if(choice >= 1 && choice <= 4) {
                System.out.print("Enter quantity: ");
                quantity = scanner.nextInt();
                
                switch (choice) {
                    case 1: 
                        total = 100 * quantity;
                        System.out.print("You Ordered " + quantity + " Burger");
                        break;
                    case 2:
                        total = 50 * quantity;
                        System.out.print("You Ordered " + quantity + " Fries");
                        break;
                    case 3:
                        total = 30 * quantity;
                        System.out.print("You Ordered " + quantity + " Soda");
                        break;
                    case 4:
                        total = 45 * quantity;
                        System.out.print("You Ordered " + quantity + " Ice Cream");
                        break;
                 }
                 
                 System.out.println("\nTotal Bill: PHP " + total);
            }
        } while (choice != 5);
    }
}
