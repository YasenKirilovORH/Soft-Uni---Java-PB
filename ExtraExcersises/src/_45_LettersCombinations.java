import java.util.Scanner;

public class _45_LettersCombinations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String letter1 = scanner.nextLine();
        String letter2 = scanner.nextLine();
        String missingLetter = scanner.nextLine();

        char onFirst = letter1.charAt(0);
        char onSecond = letter2.charAt(0);
        char onMissingLetter = missingLetter.charAt(0);

        int count = 0;

        for (char i = onFirst; i <= onSecond; i++) {
            for (char j = onFirst; j <= onSecond; j++) {
                for (char k = onFirst; k <= onSecond; k++) {

                    if (!(k == onMissingLetter) && !(j == onMissingLetter) && !(i == onMissingLetter)) {
                        System.out.printf("%c%c%c ", i, j, k);
                        count++;
                    }
                }

            }
        }
        System.out.print(count);

    }

}
