//Hannah Marielle O. Ceblano
//CITCS 1N-A
//Final challenge No.2

public class FinalLab2 {

    public static void main(String[] args) {
        
        int[][] temperatures = {
            {22, 23, 24, 25, 26, 27, 28},//Temperature in City 1
            {19, 18, 20, 17, 30, 35, 22},//Temperature in City 2
            {31, 32, 20, 25, 18, 19, 17},//Temperature in City 3
        };
        
        // Loop for 3 cities to calculate and print the average and highest temperatures
        for (int city = 0; city < temperatures.length; city++) {
            int total = 0;
            int highest = temperatures[city][0]; // Initialize highest with the first day's temperature
            
            // Loop through the days for each city
            for (int day = 0; day < temperatures[city].length; day++) {
                total += temperatures[city][day]; // Add each day's temperature to total
                if (temperatures[city][day] > highest) {
                    highest = temperatures[city][day]; // Update highest temperature
                }
            }

            // Calculate average temperature
            double average = (double) total / temperatures[city].length;
            
            // Print the results for each city
            System.out.println("City " + (city + 1) + ":");
            System.out.println("Average Temperature: " + String.format("%.2f", average) + "°C");
            System.out.println("Highest Temperature: " + highest + "°C");
        }
    }
}