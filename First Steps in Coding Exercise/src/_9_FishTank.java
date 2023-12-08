import java.util.Scanner;

public class _9_FishTank {

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        int l = Integer.parseInt (scanner.nextLine());
        int w = Integer.parseInt (scanner.nextLine());
        int h = Integer.parseInt (scanner.nextLine());
        double percent = Double.parseDouble (scanner.nextLine());

        double fishTankVolume = l * w * h;
        double volumeInLiters = fishTankVolume / 1000;
        double litersToFillTank = volumeInLiters * (1 - percent/100);

        System.out.println (litersToFillTank);


    }

}
