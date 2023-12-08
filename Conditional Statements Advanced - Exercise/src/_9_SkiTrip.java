import java.util.Scanner;

public class _9_SkiTrip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysStaying = Integer.parseInt(scanner.nextLine());
        String typeOfAccommodation = scanner.nextLine();
        String grade = scanner.nextLine();

        int nights = daysStaying - 1;
        double totalPrice = 0.00;

        switch (typeOfAccommodation) {
            case "room for one person":
                totalPrice = nights * 18.00;
                break;
            case "apartment":
                if (nights < 10) {
                    totalPrice = (nights * 25.00) * 0.70;
                } else if (nights >= 10 && nights <= 15) {
                    totalPrice = (nights * 25.00) * 0.65;
                } else {
                    totalPrice = (nights * 25.00) * 0.50;
                }
                break;
            case "president apartment":
                if (nights < 10) {
                    totalPrice = (nights * 35.00) * 0.90;
                } else if (nights >= 10 && nights <= 15) {
                    totalPrice = (nights * 35.00) * 0.85;
                } else {
                    totalPrice = (nights * 35.00) * 0.80;
                    break;
                }

        }
        if (grade.equals("positive")) {
            totalPrice = totalPrice + (totalPrice * 0.25);
        } else if (grade.equals("negative")) {
            totalPrice = totalPrice - (totalPrice * 0.10);
        }
        System.out.printf("%.2f", totalPrice);

    }
}
