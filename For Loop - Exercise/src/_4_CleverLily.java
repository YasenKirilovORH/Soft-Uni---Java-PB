import java.util.Scanner;

public class _4_CleverLily {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for (int currentAge = 1; currentAge <= age; currentAge++) {

            if (currentAge % 2 == 0) {
                sum = sum + (((double) currentAge / 2) * 10) - 1;
            } else {
                sum += toyPrice;
            }


        }
        double difference = Math.abs(sum - priceWashingMachine);

        if (sum >= priceWashingMachine){
            System.out.printf("Yes! %.2f", difference);
        } else {
            System.out.printf("No! %.2f", difference);
        }

    }

}
