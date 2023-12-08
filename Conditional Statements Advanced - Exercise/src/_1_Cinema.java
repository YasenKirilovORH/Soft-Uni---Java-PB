import java.util.Scanner;

public class _1_Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String typeOfProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double income = 0.00;
        double fullCapacity = rows * columns;

        switch (typeOfProjection) {
            case ("Premiere"):
                income = fullCapacity * 12;
                break;
            case ("Normal"):
                income = fullCapacity * 7.50;
                break;
            case ("Discount"):
                income = fullCapacity * 5;
                break;

        }
             System.out.printf("%.2f leva", income);

    }

}
