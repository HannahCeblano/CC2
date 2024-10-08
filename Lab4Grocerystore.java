//Hannah Marielle O. Ceblano 
//Cicts 1N-A
//September 12, 2024
//Laboratory 4


import java.util.Scanner;

public class Lab4Grocerystore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter total purchased amount: ");
        double discount = 0;
        double Total = scanner.nextDouble();
        
        if(Total <= 1000) {
            discount = 0; //zero discount
        }
        else if(Total > 1000 && Total <= 5000){
            discount = 0.05; //5% discount as decimal
        }
        else if(Total >= 5001 && Total < 10000) {
            discount = 0.1; //10% discount as decimal
        }
        else if(Total >= 10000) {
            discount = 0.15; //15% discount as decimal
        }
        
        Total = Total - (Total * discount); //Deducting n% to total amount
        
        System.out.println("\nDiscount applied: "+ discount * 100 + "%");
        System.out.println("\nApplied price after Discount: "+ Total);
        
    }
}