import java.util.Scanner;

public class _19_VetParking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        //обходим всички дни от 1ви до послледен
        for (int day = 1; day <= days; day++) {

            double dayPrice = 0;

            //Пресметнем таксата за деня
            // Обхождаме всички часове от първи до последен
            for (int hour = 1; hour <= hours; hour++) {

                //четен ден и нечетен час, паркингът таксъва 2,50
                if (day % 2 == 0 && hour % 2 != 0) {
                    // Таксувам 2,50
                    dayPrice += 2.50;
                }
                // Нечетен ден и четен час таксата е 1,25
                else if (day % 2 != 0 && hour % 2 == 0) {
                    // Таксувам 1,25
                    dayPrice += 1.25;
                }
                //Всички останали случаи се таксува 1 лев
                else {
                    // Таксувам 1 лев
                    dayPrice += 1;


                }
            }
            totalPrice += dayPrice;
            System.out.printf("Day: %d - %.2f leva\n", day, dayPrice);
        }
        System.out.printf("Total: %.2f leva", totalPrice);
    }

}
