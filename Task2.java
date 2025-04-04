import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kitne subjects ke marks daloge? ");
        int numSubjects = sc.nextInt();
        
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Subject " + i + " ka marks daalo: ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double avgPercentage = (totalMarks * 100.0) / (numSubjects * 100.0);
        String grade;

        if (avgPercentage >= 90) {
            grade = "A+";
        } else if (avgPercentage >= 80) {
            grade = "A";
        } else if (avgPercentage >= 70) {
            grade = "B+";
        } else if (avgPercentage >= 60) {
            grade = "B";
        } else if (avgPercentage >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
