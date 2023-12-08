import java.util.Scanner;

public class _11_FruitShop {

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        String fruit = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double price = 0.00;



        switch (fruit) {   //banana, apple, orange, grapefruit, kiwi, pineapple, grapes
            case "banana": // 2.70	 1.25	 0.90	  1.60	    3.00	5.60	  4.20

                if (dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday")) {
                    price = 2.70;
                } else if (dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Wednesday") || dayOfTheWeek.equals("Thursday") || dayOfTheWeek.equals("Friday")){
                    price = 2.50;
                } else {
                    System.out.println("error");
                    return;
                }
                break;

            case "apple":
                if (dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday")) {
                    price = 1.25;
                } else if (dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Wednesday") || dayOfTheWeek.equals("Thursday") || dayOfTheWeek.equals("Friday")) {
                    price = 1.20;
                } else {
                    System.out.println("error");
                    return;
                }
                break;

            case "orange":
                if (dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday")) {
                    price = 0.90;
                } else if (dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Wednesday") || dayOfTheWeek.equals("Thursday") || dayOfTheWeek.equals("Friday")) {
                    price = 0.85;
                } else {
                    System.out.println("error");
                    return;
                }
                break;

            case "grapefruit":
                if (dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday")) {
                    price = 1.60;
                } else if (dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Wednesday") || dayOfTheWeek.equals("Thursday") || dayOfTheWeek.equals("Friday")) {
                    price = 1.45;
                } else {
                    System.out.println("error");
                    return;
                }
                break;
            case "kiwi":
                if (dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday")) {
                    price = 3.00;
                } else if (dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Wednesday") || dayOfTheWeek.equals("Thursday") || dayOfTheWeek.equals("Friday")) {
                    price = 2.70;
                } else {
                    System.out.println("error");
                    return;
                }
                break;
            case "pineapple":
                if (dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday")) {
                    price = 5.60;
                } else if (dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Wednesday") || dayOfTheWeek.equals("Thursday") || dayOfTheWeek.equals("Friday")) {
                    price = 5.50;
                } else {
                    System.out.println("error");
                    return;
                }
                break;
            case "grapes":
                if (dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday")) {
                    price = 4.20;
                } else if (dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Wednesday") || dayOfTheWeek.equals("Thursday") || dayOfTheWeek.equals("Friday")) {
                    price = 3.85;
                } else {
                    System.out.println("error");
                    return;
                }
                break;
            default:
                System.out.println("error");
                return;

        }
        double totalAmount = price * count;
        System.out.printf("%.2f", totalAmount);

    }




}


