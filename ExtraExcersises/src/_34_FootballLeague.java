import java.util.Scanner;

public class _34_FootballLeague {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int totalFans = Integer.parseInt(scanner.nextLine());

        int fansInA = 0;
        int fansInB = 0;
        int fansInV = 0;
        int fansInG = 0;

        for (int fans = 1; fans <= totalFans; fans++) {

            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    fansInA++;
                    break;
                case "B":
                    fansInB++;
                    break;
                case"V":
                    fansInV++;
                    break;
                case "G":
                    fansInG++;
                    break;


            }

        }
        double averageInA = (double) fansInA / totalFans * 100;
        double averageInB = (double) fansInB / totalFans * 100;
        double averageInV = (double) fansInV / totalFans * 100;
        double averageInG = (double) fansInG / totalFans * 100;
        double averageFans = (double) totalFans / stadiumCapacity * 100;

        System.out.printf("%.2f%%%n", averageInA);
        System.out.printf("%.2f%%%n", averageInB);
        System.out.printf("%.2f%%%n", averageInV);
        System.out.printf("%.2f%%%n", averageInG);
        System.out.printf("%.2f%%%n", averageFans);
    }

}
