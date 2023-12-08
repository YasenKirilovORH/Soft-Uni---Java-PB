import java.util.Scanner;

public class _7_HotelRoom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.00;
        double apartmentPrice = 0.00;
        double totalPriceStudio = 0.00;
        double totalPriceApartment = 0.00;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50.00;
            apartmentPrice = 65.00;
            totalPriceStudio = studioPrice * nights;
            totalPriceApartment = apartmentPrice * nights;

            if (nights > 7 && nights < 14) {
                totalPriceStudio = totalPriceStudio - (totalPriceStudio * 0.05);

            } else if (nights > 14) {
                totalPriceApartment = totalPriceApartment - (totalPriceApartment * 0.10);
                totalPriceStudio = totalPriceStudio - (totalPriceStudio * 0.30);

            }

        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.20;
            apartmentPrice = 68.70;
            totalPriceStudio = studioPrice * nights;
            totalPriceApartment = apartmentPrice * nights;

            if (nights > 7 && nights < 14) {
                totalPriceStudio = totalPriceStudio - (totalPriceStudio * 0.20);
            } else if (nights > 14) {
                totalPriceApartment = totalPriceApartment - (totalPriceApartment * 0.10);
                totalPriceStudio = totalPriceStudio - (totalPriceStudio * 0.20);
            }

        } else {
            studioPrice = 76.00;
            apartmentPrice = 77.00;
                totalPriceStudio = studioPrice * nights;
                totalPriceApartment = apartmentPrice * nights;

                if (nights > 14) {
                    totalPriceApartment = totalPriceApartment - (totalPriceApartment * 0.10);
                }
        }
        System.out.printf("Apartment: %.2f lv. %n", totalPriceApartment);
        System.out.printf("Studio: %.2f lv.", totalPriceStudio);
    }

}
