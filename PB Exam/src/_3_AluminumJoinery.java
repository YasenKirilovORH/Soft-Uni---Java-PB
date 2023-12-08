import java.util.Scanner;

public class _3_AluminumJoinery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numJoinery = Integer.parseInt(scanner.nextLine());
        String typeJoinery = scanner.nextLine();
        String delivery = scanner.nextLine();

        double pricePerPiece = 0;
        double sum = 0;
        double deliveryPrice = 60;

        if (numJoinery < 10) {
            System.out.println("Invalid order");
            return;

            }


        switch (typeJoinery) {
            case ("90X130"):
                pricePerPiece = 110;
                sum = pricePerPiece * numJoinery;
                if (numJoinery > 30 && numJoinery <= 60) {
                    sum = sum - (sum * 0.05);
                } else if (numJoinery > 60) {
                    sum = sum - (sum * 0.08);
                }
                break;


            case ("100X150"):
                pricePerPiece = 140;
                sum = pricePerPiece * numJoinery;
                if (numJoinery > 40 && numJoinery <= 80) {
                    sum = sum - (sum * 0.06);
                } else if (numJoinery > 80) {
                    sum = sum - (sum * 0.10);
                }
                break;

            case ("130X180"):
                pricePerPiece = 190;
                sum = pricePerPiece * numJoinery;
                if (numJoinery > 20 && numJoinery <= 50) {
                    sum = sum - (sum * 0.07);
                } else if (numJoinery > 50) {
                    sum = sum - (sum * 0.12);
                }
                break;

            case ("200X300"):
                pricePerPiece = 250;
                sum = pricePerPiece * numJoinery;
                if (numJoinery > 25 && numJoinery <= 50) {
                    sum = sum - (sum * 0.09);
                } else if (numJoinery > 50) {
                    sum = sum - (sum * 0.14);
                }
                break;



        }
        if (delivery.equals("With delivery")) {
            sum = sum + deliveryPrice;
        }
        if (numJoinery > 99) {
            sum = sum - (sum * 0.04);
        }

        System.out.printf("%.2f BGN", sum);

    }
}
