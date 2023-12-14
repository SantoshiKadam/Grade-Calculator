import java.util.Scanner;
public class GradeCalculator 
{
    // Grade calculation
    public static char calculateGrade(double averagePercentage) 
    {
        if (averagePercentage >= 90) 
            return 'A';
        else if (averagePercentage >= 80) 
            return 'B';
        else if (averagePercentage >= 70) 
            return 'C';
        else if (averagePercentage >= 60) 
            return 'D';
        else if (averagePercentage >= 50) 
            return 'E';
        else 
            return 'F';
        
    }
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t\tGRADE CALCULATOR");
        System.out.print("\n_____________________________________________________");
        // Number of subjects
        int numOfSub;
        System.out.println("\nEnter the number of subjects: ");
        numOfSub = scanner.nextInt();

        // Store marks in Array
        int[] marks = new int[numOfSub];
        System.out.println("Enter Marks:");
        // Marks Input
        for (int i = 0; i < numOfSub; i++) 
        {
            System.out.print("Subject " + (i + 1) + " marks:");
            marks[i] = scanner.nextInt();
        }

        // Total marks calculation
        int totalMarks = 0;
        for (int mark : marks) 
        {
            totalMarks += mark;
        }

        // Average percentage calculation
        double averagePercentage = (double) totalMarks / numOfSub;

        // calling grade calculation method
        char grade = calculateGrade(averagePercentage);

        // Display results
        System.out.println("Total Marks: " + "("+totalMarks+"/"+numOfSub*100+")");
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}