//Hannah Marielle O. Ceblano
//CITCS 1N-A
//Laboratory 6



import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input the total number of students
        System.out.print("Enter the total number of students: ");
        int totalStudents = scanner.nextInt();
        
        int presentCount = 0; //Variable Counts students who are present
        int absentCount = 0;  //Variable Counts students who are absent
        
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Is Student" + i + " present? (Y/N): ");
            char attendance = scanner.next().charAt(0); // input for present or absent (Y/N)
            
            // Count the number of present and absent students
            if(attendance == 'Y' || attendance == 'y') {
                presentCount++;
            } else if (attendance == 'N' || attendance == 'n') {
                absentCount++;
            } else {
                System.out.println("Invalid input, please enter 'Y' or 'N'.");
                i--;
            }
        }
        //Display the final counts of present and absent Students
        System.out.println("Total present: " + presentCount);
        System.out.println("Total absent: " + absentCount);
        
        
        scanner.close();
  
    }
}