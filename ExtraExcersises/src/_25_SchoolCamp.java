import java.util.Scanner;

public class _25_SchoolCamp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String season = scanner.nextLine();
        String typeOfGroup = scanner.nextLine();
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 0.00;
        String typeOfSport = "";

        switch (season) {
            case ("Winter"):
                if (typeOfGroup.equals("boys") || typeOfGroup.equals("girls")) {
                    pricePerNight = 9.60;
                } else {
                    pricePerNight = 10;
                }
                break;
            case ("Spring"):
                if (typeOfGroup.equals("boys") || typeOfGroup.equals("girls")) {
                    pricePerNight = 7.20;
                } else {
                    pricePerNight = 9.50;
                }
                break;
            case ("Summer"):
                if (typeOfGroup.equals("boys") || typeOfGroup.equals("girls")) {
                    pricePerNight = 15;
                } else {
                    pricePerNight = 20;
                }
                break;
        }
                if (season.equals("Winter")) {
                    if (typeOfGroup.equals("boys")) {
                        typeOfSport = "Judo";
                    } else if (typeOfGroup.equals("girls")) {
                        typeOfSport = "Gymnastics";
                    } else {
                        typeOfSport = "Ski";
                    }
                } else if (season.equals("Spring")) {
                    if (typeOfGroup.equals("boys")) {
                        typeOfSport = "Tennis";
                    } else if (typeOfGroup.equals("girls")) {
                        typeOfSport = "Athletics";
                    } else {
                        typeOfSport = "Cycling";
                    }
                } else {
                    if (typeOfGroup.equals("boys")) {
                        typeOfSport = "Football";
                    } else if (typeOfGroup.equals("girls")) {
                        typeOfSport = "Volleyball";
                    } else {
                        typeOfSport = "Swimming";
                    }
                }
                double totalPrice = (numberOfStudents * pricePerNight) * nights;

                if (numberOfStudents >= 10 && numberOfStudents < 20) {
                    totalPrice = totalPrice - (totalPrice * 0.05);
                } else if (numberOfStudents >= 20 && numberOfStudents < 50) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                } else if (numberOfStudents >= 50) {
                    totalPrice = totalPrice - (totalPrice * 0.50);
                }

        System.out.printf("%s %.2f lv.", typeOfSport, totalPrice);

    }

}
