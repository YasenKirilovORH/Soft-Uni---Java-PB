import java.util.Scanner;

public class _33_Bills {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double electricity = 0;
        double watter = 20;
        double totalWatter = 0;
        double internet = 15;
        double totalInternet = 0;
        double others = 0;
        double totalOthers = 0;
        double sum = 0;

        for (int month = 1; month <= months; month++) {

            double electricityBill = Double.parseDouble(scanner.nextLine());
            sum += electricityBill;
            electricity += electricityBill;
            totalWatter += watter;
            totalInternet += internet;
            others = electricityBill + watter + internet;
            totalOthers += others + (others * 0.20);



        }
            double averageBill = (electricity + totalWatter + totalInternet + totalOthers) / months;
        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", totalWatter);
        System.out.printf("Internet: %.2f lv%n", totalInternet);
        System.out.printf("Other: %.2f lv%n", totalOthers);
        System.out.printf("Average: %.2f lv%n", averageBill);
    }

}
