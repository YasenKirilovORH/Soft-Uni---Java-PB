import java.util.Scanner;

public class _7_HousePainting {

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double frontAndBack = 2 * (x * x);
        double frontAndBackWithoutDoor = frontAndBack - 1.2 * 2;
        double sideWalls = 2 * (x * y);
        double sideWallsWithoutWindows = sideWalls - 2 * (1.5 * 1.5);

        double roofRectangle = 2 * (x * y);
        double roofTriangle = 2 * (x * h/2);

        double areaForGreenPaint = frontAndBackWithoutDoor + sideWallsWithoutWindows;
        double areaForRedPaint = roofRectangle + roofTriangle;

        double greenPaint = areaForGreenPaint / 3.4;
        double redPaint = areaForRedPaint / 4.3;

        System.out.printf ("%.2f %n", greenPaint);
        System.out.printf ("%.2f", redPaint);
    }

}
