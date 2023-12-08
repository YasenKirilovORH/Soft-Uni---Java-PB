import java.util.Scanner;

public class _17_FuelTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());

        if (typeOfFuel.equals("Diesel")) {
            if (liters >= 25) {
                System.out.println("You have enough diesel.");
            } else {
                System.out.println("Fill your tank with diesel!");
            }
        } else if (typeOfFuel.equals("Gas")) {
            if (liters >= 25) {
                System.out.println("You have enough gas.");
            } else {
                System.out.println("Fill your tank with gas!");
            }

        } else if (typeOfFuel.equals("Gasoline")) {
            if (liters >= 25) {
                System.out.println("You have enough gasoline.");
            } else {
                System.out.println("Fill your tank with gasoline!");
            }
        } else {
                System.out.println ("Invalid fuel!");
        }

    }
}
