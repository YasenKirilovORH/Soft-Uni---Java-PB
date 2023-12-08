import java.util.Scanner;

public class _26_PointOnRectangleBorder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean border = false;

        if (x == x1 && y > y1 && y <= y2) {
            border = true;
        } else if (x == x2 && y > y1 && y < y2) {
            border = true;
        } else if (y == y1 && x > x1 && x < x2) {
            border = true;
        } else if (y == y2 && x > x1 && x < x2) {
            border = true;
        }
        if (border) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }

}
