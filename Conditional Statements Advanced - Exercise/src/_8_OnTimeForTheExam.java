import java.util.Scanner;

public class _8_OnTimeForTheExam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int examTimeHour = Integer.parseInt(scanner.nextLine());
        int examTimeMinute = Integer.parseInt(scanner.nextLine());
        int arrivalTimeHour = Integer.parseInt(scanner.nextLine());
        int arrivalTimeMinute = Integer.parseInt(scanner.nextLine());

        int examTime = examTimeHour * 60 + examTimeMinute;
        int arrivalTime = arrivalTimeHour * 60 + arrivalTimeMinute;

        int difference = Math.abs(arrivalTime - examTime);

        if (examTime < arrivalTime) {
            System.out.println("Late");
            if (difference >= 60) {
                int hour = difference / 60;
                int minutes = difference % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            } else {
                System.out.printf("%d minutes after the start", difference);
            }
        } else if (examTime == arrivalTime || difference <= 30) {
            System.out.println("On time");
            if (difference != 0) {
                System.out.printf("%d minutes before the start", difference);
            }
            } else {
                System.out.println("Early");
                if (difference >= 60) {
                    int hour = difference / 60;
                    int minutes = difference % 60;
                    System.out.printf("%d:%02d hours before the start", hour, minutes);
                } else {
                    System.out.printf("%d minutes before the start", difference);
                }
            }

        }

    }

