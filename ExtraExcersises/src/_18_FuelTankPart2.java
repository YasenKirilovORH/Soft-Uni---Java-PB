import java.util.Scanner;

public class _18_FuelTankPart2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double priceGasoline = 2.22;
        double priceDiesel = 2.33;
        double priceGas = 0.93;

        double discountGasoline = priceGasoline - 0.18;
        double discountDiesel = priceDiesel - 0.12;
        double discountGas = priceGas - 0.08;
        double totalPrice = 0;

        if (fuel.equals("Gasoline")) {
            if (card.equals("Yes")) {
                totalPrice = amount * discountGasoline;
                if (amount >= 20 && 25 >= amount) {
                    totalPrice = totalPrice - (totalPrice * 0.08);
                } else if (amount > 25) {
                    totalPrice = totalPrice - (totalPrice * 0.1);
                }
            } else if (card.equals("No")) {
                totalPrice = amount * priceGasoline;
                if (amount >= 20 && 25 >= amount) {
                    totalPrice = totalPrice - (totalPrice * 0.08);
                } else if (amount > 25) {
                    totalPrice = totalPrice - (totalPrice * 0.1);
                }
            }
        } if (fuel.equals("Diesel")) {
            if (card.equals("Yes")) {
                totalPrice = amount * discountDiesel;
                if (amount >= 20 && 25 >= amount) {
                    totalPrice = totalPrice - (totalPrice * 0.08);
                } else if (amount > 25) {
                    totalPrice = totalPrice - (totalPrice * 0.1);
                }
            } else if (card.equals("No")) {
                totalPrice = amount * priceDiesel;
                if (amount >= 20 && 25 >= amount) {
                    totalPrice = totalPrice - (totalPrice * 0.08);
                } else if (amount > 25) {
                    totalPrice = totalPrice - (totalPrice * 0.1);
                }
            }
        } if (fuel.equals("Gas")) {
            if (card.equals("Yes")) {
                totalPrice = amount * discountGas;
                if (amount >= 20 && 25 >= amount) {
                    totalPrice = totalPrice - (totalPrice * 0.08);
                } else if (amount > 25) {
                    totalPrice = totalPrice - (totalPrice * 0.1);
                }
            } else if (card.equals("No")) {
                totalPrice = amount * priceGas;
                if (amount >= 20 && 25 >= amount) {
                    totalPrice = totalPrice - (totalPrice * 0.08);
                } else if (amount > 25){
                    totalPrice = totalPrice - (totalPrice * 0.1);
                }
            }
        }
                System.out.printf ("%.2f lv.", totalPrice);


    }
}