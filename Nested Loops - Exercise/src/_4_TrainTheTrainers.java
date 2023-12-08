import java.util.Scanner;

public class _4_TrainTheTrainers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numJudges = Integer.parseInt(scanner.nextLine());
        double totalGrades = 0;
        double countGrades = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            double grades = 0;


            for (int i = 0; i < numJudges; i++) {
                countGrades ++;
                double grade = Double.parseDouble(scanner.nextLine());
                grades += grade;
            }


            System.out.printf("%s - %.2f.%n", input, grades/numJudges);
            totalGrades += grades;
            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.%n", totalGrades / countGrades);
    }

}
