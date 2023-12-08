import java.util.Scanner;

public class _5_GodzillaVsKong {

    public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);

    double budget = Double.parseDouble(scanner.nextLine());
    int numOfPeople = Integer.parseInt(scanner.nextLine());
    double costumePrice = Double.parseDouble(scanner.nextLine());

    double decorePrice = budget * 0.10;
    double costumeTotalPrice = numOfPeople * costumePrice;


    if (numOfPeople > 150){
        costumeTotalPrice = costumeTotalPrice - (costumeTotalPrice * 10/100);
    }
    double result = decorePrice + costumeTotalPrice;
    double difference = Math.abs(budget - result);

    if (budget >= result){
    System.out.println("Action!");
    System.out.printf ("Wingard starts filming with %.2f leva left.", budget - result);


    } else {
        System.out.println("Not enough money!");
        System.out.printf ("Wingard needs %.2f leva more.", difference);

    }


    }

}
