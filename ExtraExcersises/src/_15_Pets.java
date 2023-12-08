import java.util.Scanner;

public class _15_Pets {

    public static void main (String []args){

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodTotalLeft = Integer.parseInt(scanner.nextLine());
        double foodForDogPerDayKg = Double.parseDouble(scanner.nextLine());
        double foodForCatPerDayKg = Double.parseDouble(scanner.nextLine());
        double foodForTurtlePerDayGrams = Double.parseDouble(scanner.nextLine());


        double totalFoodForDog = days * foodForDogPerDayKg;
        double totalFoodForCat = days * foodForCatPerDayKg;
        double totalFoodForTurtle = days * foodForTurtlePerDayGrams;
        double totalFoodForTurtleKg = totalFoodForTurtle / 1000;
        double totalFoodNeeded = totalFoodForDog + totalFoodForCat + totalFoodForTurtleKg;
        double difference = Math.abs(foodTotalLeft - totalFoodNeeded);

        if (totalFoodNeeded >= foodTotalLeft){
            System.out.printf ("%.0f kilos of food left",Math.ceil(difference));
        } else {
            System.out.printf ("%.0f more kilos of food are needed",Math.floor(difference));
        }

    }
}
