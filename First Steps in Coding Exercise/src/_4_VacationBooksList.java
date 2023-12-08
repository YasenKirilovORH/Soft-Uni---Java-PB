import java.util.Scanner;

public class _4_VacationBooksList {

    public static void main (String[] args){

      Scanner scanner = new Scanner (System.in);

      int pages = Integer.parseInt (scanner.nextLine());
      int pagesPerHour = Integer.parseInt (scanner.nextLine());
      int daysPerBook = Integer.parseInt (scanner.nextLine());

      int hoursPerDay = (pages / pagesPerHour) / daysPerBook;

      System.out.println (hoursPerDay);

    }

}
