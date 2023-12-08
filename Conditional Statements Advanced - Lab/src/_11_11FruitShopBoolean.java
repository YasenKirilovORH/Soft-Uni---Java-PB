import java.util.Scanner;

public class _11_11FruitShopBoolean {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        boolean isWorkingDay = dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Wednesday") || dayOfTheWeek.equals("Thursday") || dayOfTheWeek.equals("Friday");

        boolean isWeekendDay = dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday");

        boolean isValid = true;

        double price = 0.00;

        if (isWorkingDay) {
            if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("apple")) {
                price = 1.20;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            } else {
                isValid = false;
            }

        } else if (isWeekendDay) {
            if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
            } else if (fruit.equals("grapes")) {
                price = 4.20;
            } else {
                isValid = false;

            }

        } else isValid = false;
        if (isValid) {
            double result = count * price;
            System.out.printf("%.2f", result);
    } else {
            System.out.println("error");
        }

    }
}
