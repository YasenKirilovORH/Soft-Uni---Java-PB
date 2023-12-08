import java.util.Scanner;

public class _2_ExamPreparation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxLowGrades = Integer.parseInt(scanner.nextLine());
        int sumLowGrades = 0;
        int sumGrades = 0;
        int tasks = 0;
        String lastTask = "";

        String input = scanner.nextLine();

        while (!input.equals("Enough")) {
            tasks++;
            int grade =Integer.parseInt(scanner.nextLine());
            sumGrades += grade;
            if (grade <= 4) {
                sumLowGrades++;

            }
            if (sumLowGrades == maxLowGrades) {
                break;
            }
            lastTask = input;
            input = scanner.nextLine();
        }
        if (sumLowGrades == maxLowGrades) {
            System.out.printf("You need a break, %d poor grades.%n", sumLowGrades);
        } else {
            System.out.printf("Average score: %.2f%n", (double) sumGrades / tasks);
            System.out.printf("Number of problems: %d%n", tasks);
            System.out.printf("Last problem: %s%n", lastTask);

        }

    }

}
