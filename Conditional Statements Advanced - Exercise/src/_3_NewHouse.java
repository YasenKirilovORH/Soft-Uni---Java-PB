import java.util.Scanner;

public class _3_NewHouse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String typeOfFlowers = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.00;

        switch (typeOfFlowers) {
            case "Roses":
                totalPrice = quantity * 5.00;
                if (quantity > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                break;

            case "Dahlias":
                totalPrice = quantity * 3.80;
                if (quantity > 90) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;

            case "Tulips":
                totalPrice = quantity * 2.80;
                if (quantity > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;

            case "Narcissus":
                totalPrice = quantity * 3.00;
                if (quantity < 120) {
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;

            case "Gladiolus":
                totalPrice = quantity * 2.50;
                if (quantity < 80) {
                    totalPrice = totalPrice + (totalPrice * 0.20);
                }
                break;
        }
            if (budget >= totalPrice) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, typeOfFlowers, budget -totalPrice);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
            }
    }

}
