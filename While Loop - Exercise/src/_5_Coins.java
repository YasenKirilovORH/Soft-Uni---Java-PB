import java.util.Scanner;

public class _5_Coins {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        double sumInCents = Math.floor(amount*100);
        int totalCoins = 0;


        while (!(sumInCents == 0)) {

            if (sumInCents >= 200) {
                totalCoins++;
                sumInCents -= 200;
            } else if (sumInCents >= 100) {
                totalCoins++;
                sumInCents -= 100;
            } else if (sumInCents >= 50) {
                totalCoins++;
                sumInCents -= 50;
            } else if (sumInCents >= 20) {
                totalCoins++;
                sumInCents -= 20;
            } else if (sumInCents >= 10) {
                totalCoins++;
                sumInCents -= 10;
            } else if (sumInCents >= 5) {
                totalCoins++;
                sumInCents -= 5;
            } else if (sumInCents >= 2) {
                totalCoins++;
                sumInCents-= 2;
            } else if (sumInCents >= 1){
                totalCoins++;
                sumInCents -=1;
            }
        }
        System.out.println(totalCoins);
    }

}
