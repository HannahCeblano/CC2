//Hannah Marielle O. Ceblano
//CITCS 1N-A
//Final challenge N0.3

public class StudentEnrollmentSystem {
    public static void main(String[] args) {
        // Array to store student names
        String[] studentNames = {"Gab", "John", "David", "Sophia", "Charles"};
        
        // 2D array to store grades for each student in 3 subjects
        double[][] grades = {
            {82, 95, 79}, // Grades for Gab
            {78, 98, 89}, // Grades for John
            {94, 81, 93}, // Grades for David
            {75, 80, 79}, // Grades for Sophia
            {95, 71, 98}, // Grades for Charles
        };
        
        // Calculate and display average grades for each student
        System.out.println("Student's Average Grade:");
        for (int i = 0; i < studentNames.length; i++) {
            double sum = 0;
            for (double grade : grades[i]) {
                sum += grade; // Sum up the grades
            }
            double average = sum / grades[i].length; // Calculate average
            System.out.printf("%-10s: %.2f%n", studentNames[i], average); // Print result
        }
    }
}