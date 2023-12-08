import java.util.Scanner;

public class _23_FitnessCenter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numVisitors = Integer.parseInt(scanner.nextLine());

        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;
        double training = 0;
        double shopping = 0;


        for (int i = 1; i <= numVisitors; i++) {

            String typeOfVisit = scanner.nextLine();

            switch (typeOfVisit) {
                case "Back":
                    back++;
                    training++;
                    break;

                case "Chest":
                    chest++;
                    training++;
                    break;

                case "Legs":
                    legs++;
                    training++;
                    break;

                case "Abs":
                    abs++;
                    training++;
                    break;

                case "Protein shake":
                    proteinShake++;
                    shopping++;
                    break;

                case "Protein bar":
                    proteinBar++;
                    shopping++;
                    break;

            }

        }
        System.out.printf("%d - back\n", back);
        System.out.printf("%d - chest\n", chest);
        System.out.printf("%d - legs\n", legs);
        System.out.printf("%d - abs\n", abs);
        System.out.printf("%d - protein shake\n", proteinShake);
        System.out.printf("%d - protein bar\n", proteinBar);
        System.out.printf("%.2f%% - work out\n", training / numVisitors * 100);
        System.out.printf("%.2f%% - protein\n", shopping / numVisitors * 100);
    }

}
