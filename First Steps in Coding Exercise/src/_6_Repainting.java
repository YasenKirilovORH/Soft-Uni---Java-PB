import java.util.Scanner;

public class _6_Repainting {

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        int nylon = Integer.parseInt (scanner.nextLine());
        int paint = Integer.parseInt (scanner.nextLine());
        int diluent = Integer.parseInt (scanner.nextLine());
        int totalHours = Integer.parseInt (scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = paint * 14.50;
        double diluentPrice = diluent * 5;
        double bag = 0.40;

        double totalSum = (nylonPrice + paintPrice + (paintPrice * 10/100) + diluentPrice + bag);
        double workersPayment = (totalSum * 30/100) * totalHours;
        double totalAmount = totalSum + workersPayment;

        System.out.println (totalAmount);


    }

}
