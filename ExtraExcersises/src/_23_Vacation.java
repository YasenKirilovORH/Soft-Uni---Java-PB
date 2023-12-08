import java.util.Scanner;

public class _23_Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String placeToStay = "";
        String location = "";
        double price = 0.00;

        if (budget <= 1000) {
            placeToStay = "Camp";
            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.65;
            } else {
                location = "Morocco";
                price = budget * 0.45;
            }

        } else if (budget > 1000 && budget <= 3000) {
            placeToStay = "Hut";
            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.80;
            } else {
                location = "Morocco";
                price = budget * 0.60;
            }
        } else {
            placeToStay = "Hotel";
            price = budget * 0.90;
            if (season.equals("Summer")) {
                location = "Alaska";
            } else {
                location = "Morocco";
            }
        }
            System.out.printf ("%s - %s - %.2f", location, placeToStay, price);
    }

}
