import java.util.Scanner;

public class _3_DepositCalculator {

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        double deposit = Double.parseDouble (sc.nextLine());
        int months = Integer.parseInt (sc.nextLine());
        double percent = Double.parseDouble (sc.nextLine());

        double interest = deposit * percent/100.0;
        double interestPerMonth = interest / 12.0;

        double totalAmount = deposit + months * interestPerMonth;

        System.out.println (totalAmount);


    }

}
