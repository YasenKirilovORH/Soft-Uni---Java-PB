import java.util.Scanner;

public class _7_Moving {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int availableSpace = w * l * h;

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int luggage = Integer.parseInt(input);
            availableSpace -= luggage;
            if (availableSpace < 0) {
                break;
            }

            input = scanner.nextLine();
        }
            if (availableSpace < 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(availableSpace));
            } else {
                System.out.printf("%d Cubic meters left.", availableSpace);
            }
    }

}
