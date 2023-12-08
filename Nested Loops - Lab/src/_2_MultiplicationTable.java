public class _2_MultiplicationTable {

    public static void main(String[] args) {

        for (int firstNum = 1; firstNum <= 10; firstNum++) {
            for (int secondNum = 1; secondNum <= 10; secondNum++) {

                int sum = firstNum * secondNum;

                System.out.println(firstNum + " * " + secondNum + " = " + sum);
            }
        }

    }

}
