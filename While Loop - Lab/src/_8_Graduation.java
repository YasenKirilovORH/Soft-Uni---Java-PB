import java.util.Scanner;

public class _8_Graduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int counter = 0;
        int lowGrades = 0;
        double sumGrades = 0;

        while (counter != 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                lowGrades++;
                if (lowGrades > 1) {
                    break;
                }
            }
            sumGrades += grade;
            counter++;
        }
        if (counter == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumGrades / counter);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, counter);
        }

    }
}


