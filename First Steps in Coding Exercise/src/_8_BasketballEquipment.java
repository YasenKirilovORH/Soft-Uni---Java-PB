import java.util.Scanner;

public class _8_BasketballEquipment {

    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        int pricePerYear = Integer.parseInt (sc.nextLine());

        double shoes = (pricePerYear - (pricePerYear *40/100.00));
        double sportOutfit =(shoes - (shoes * 20/100.00));
        double ball = sportOutfit / 4;
        double accessories = ball / 5;

        double totalAmount = pricePerYear + shoes + sportOutfit + ball + accessories;

        System.out.println (totalAmount);


    }
}
