import java.util.Scanner;

public class _49_WeddingSeats {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String lastSector = scanner.nextLine();
        int rowsFirstSector = Integer.parseInt(scanner.nextLine());
        int oddSeats = Integer.parseInt(scanner.nextLine());

        char firstSector = lastSector.charAt(0);
        int seats = 0;

        for (char i = 'A'; i <= firstSector; i++) {
            if (i > 'A') {
                rowsFirstSector++;
            }
            char initial = 'a';
            for (int j = 1; j <= rowsFirstSector; j++) {
                initial = 'a';
                if (!(j % 2 == 0)) {
                    for (int k = 1; k <= oddSeats; k++) {
                        System.out.printf("%c%d%c\n", i, j, initial);
                        initial++;
                        seats++;
                    }
                } else {
                    for (int k = 1; k <= (oddSeats + 2); k++) {
                        System.out.printf("%c%d%c\n", i, j, initial);
                        initial++;
                        seats++;
                    }
                }
            }
        }

        System.out.println(seats);
    }

}
