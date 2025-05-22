import java.util.ArrayList;
import java.util.Scanner;

 class StudentGradeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println(" Student Grade Analyzer");

        // Input section
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }

        // Calculations
        double sum = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);

        for (double grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = sum / grades.size();

        // Output results
        System.out.println("\n Grade Summary:");
        System.out.printf("Average Grade: %.2f\n", average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        scanner.close();
    }
}
