import java.util.Scanner;

public class _8_PetShop {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());

        System.out.println(dogFood * 2.50 + catFood * 4);



    }


}
