import java.util.Scanner;

public class _1_USDtoBGN {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        double USD = Double.parseDouble (scanner.nextLine());
        double BGN = USD * 1.79549;

        System.out.println (BGN);

    }

}
