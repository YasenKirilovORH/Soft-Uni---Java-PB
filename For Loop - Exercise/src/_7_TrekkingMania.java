import java.util.Scanner;

public class _7_TrekkingMania {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupsNumber = Integer.parseInt(scanner.nextLine());
        double Mussala = 0;
        double Montblanc = 0;
        double Kilimadjaro = 0;
        double K2 = 0;
        double Everest = 0;
        int totalPeople = 0;

        for ( int groups = 1; groups <= groupsNumber; groups++) {

            int numberOfPeopleInGroup = Integer.parseInt(scanner.nextLine());
            totalPeople += numberOfPeopleInGroup;

            if (numberOfPeopleInGroup <= 5) {
                Mussala += numberOfPeopleInGroup;
            } else if (numberOfPeopleInGroup <= 12) {
                Montblanc += numberOfPeopleInGroup;
            } else if (numberOfPeopleInGroup <=25) {
                Kilimadjaro += numberOfPeopleInGroup;
            } else if (numberOfPeopleInGroup <= 40) {
                K2 += numberOfPeopleInGroup;
            } else {
                Everest += numberOfPeopleInGroup;
            }

        }
        System.out.printf("%.2f%%%n", Mussala / totalPeople * 100);
        System.out.printf("%.2f%%%n", Montblanc / totalPeople * 100);
        System.out.printf("%.2f%%%n", Kilimadjaro / totalPeople * 100);
        System.out.printf("%.2f%%%n", K2 / totalPeople * 100);
        System.out.printf("%.2f%%%n", Everest / totalPeople * 100);
    }

}
