
package finalchallenge.pkg5;
import javax.swing.*;

// Custom Exception for Invalid Quantity (Shopping Cart)
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

// Custom Exception for No Seats Available (Flight Booking)
class NoSeatsAvailableException extends Exception {
    public NoSeatsAvailableException(String message) {
        super(message);
    }
}

// Shopping Cart Class
class ShoppingCart {
    private int availableStock;

    public ShoppingCart(int stock) {
        this.availableStock = stock;
    }

    // Method to handle purchasing of items
    public void purchase(int quantity) throws InvalidQuantityException {
        if (quantity <= 0) {
            throw new InvalidQuantityException("Quantity must be positive.");
        }
        if (quantity > availableStock) {
            throw new InvalidQuantityException("Not enough stock available. \nOnly " + availableStock + " items left.");
        }
        availableStock -= quantity;
        JOptionPane.showMessageDialog(null, "Purchase successful!\nYou bought " + quantity + " item(s). \nRemaining stock: " + availableStock);
    }
}

// Flight Booking System Class
class FlightBookingSystem {
    private int availableSeats;

    public FlightBookingSystem(int seats) {
        this.availableSeats = seats;
    }

    // Method for booking seats
    public void bookSeat(int quantity) throws NoSeatsAvailableException {
        if (availableSeats < quantity) {
            throw new NoSeatsAvailableException("Not enough seats available for booking.\n Only " + availableSeats + " seats left.");
        }
        availableSeats -= quantity;
        JOptionPane.showMessageDialog(null, "Successfully booked " + quantity + " seat(s).\n Remaining seats: " + availableSeats);
    }
}

public class FinalChallenge5 {
    public static void main(String[] args) {
        // Initializing objects for ShoppingCart and FlightBookingSystem
        ShoppingCart cart = new ShoppingCart(10);  // Example: 10 items in stock
        FlightBookingSystem flight = new FlightBookingSystem(10);  // Example: 10 available seats

        // Main menu for user interaction
        while (true) {
            // Show the main menu to choose between shopping cart or flight booking
            String[] options = {"Shopping Cart", "Flight Booking", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Main Menu", 
                                                      JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                                                      null, options, options[0]);

            if (choice == 2) {
                // Exit the program
                JOptionPane.showMessageDialog(null, "Thank you!");
                break;
            }

            // Proceed to shopping cart if the user selects that option
            if (choice == 0) {
                String input = JOptionPane.showInputDialog("Enter quantity to purchase:");
                if (input == null) break;  // Exit if canceled
                try {
                    int quantity = Integer.parseInt(input);
                    cart.purchase(quantity);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid integer for quantity.");
                } catch (InvalidQuantityException e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            }

            // Proceed to flight booking if the user selects that option
            if (choice == 1) {
                String input = JOptionPane.showInputDialog("Welcome to Air Asia!!\nEnter the number of seats you want to book:");
                if (input == null) break;  // Exit if canceled
                try {
                    int seatsToBook = Integer.parseInt(input);
                    flight.bookSeat(seatsToBook);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number for seats.");
                } catch (NoSeatsAvailableException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
