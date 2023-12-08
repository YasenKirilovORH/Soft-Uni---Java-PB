import java.util.Scanner;

public class _4_ToyShop {

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        double vacationPrice = Double.parseDouble (scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double puzzlesPrice = 2.60;
        double dollsPrice = 3;
        double bearsPrice = 4.10;
        double minionsPrice = 8.20;
        double trucksPrice = 2;



        int totalNumber = puzzles + dolls + bears + minions + trucks;
        double totalAmount = puzzles * puzzlesPrice + dolls * dollsPrice + bears * bearsPrice + minions * minionsPrice + trucks * trucksPrice;

        if (totalNumber >= 50){
            totalAmount = totalAmount - (totalAmount* 25/100);
        }
        double rent = totalAmount * 0.10;
        totalAmount = totalAmount - rent;
        double money = totalAmount - vacationPrice;

        if (totalAmount >= vacationPrice){
            System.out.printf ("Yes! %.2f lv left.", money);

        } else {
            System.out.printf ("Not enough money! %.2f lv needed.", Math.abs (money));
        }

    }
}
