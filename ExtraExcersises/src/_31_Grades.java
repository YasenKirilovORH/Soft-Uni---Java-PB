import java.util.Scanner;

public class _31_Grades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        double fail = 0;
        double poor = 0;
        double good = 0;
        double excellent =0;
        double sum = 0;

        for (int student = 1; student <= numberOfStudents; student++) {

        double grade = Double.parseDouble(scanner.nextLine());
        sum += grade;
        if (grade <= 2.99) {
            fail++;
        } else if (grade <= 3.99) {
            poor++;

        } else if (grade <= 4.99) {
            good++;
        } else {
            excellent++;
        }

        }
        double averageFail = (fail / numberOfStudents) * 100;
        double averagePoor = (poor / numberOfStudents) * 100;
        double averageGood = (good / numberOfStudents) * 100;
        double averageExcellent = (excellent / numberOfStudents) * 100;
        double average = sum / numberOfStudents;

        System.out.printf("Top students: %.2f%%%n", averageExcellent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", averageGood);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", averagePoor);
        System.out.printf("Fail: %.2f%%%n", averageFail);
        System.out.printf("Average: %.2f", average);

    }

}
