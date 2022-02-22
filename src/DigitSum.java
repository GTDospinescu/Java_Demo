public class DigitSum {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 is " + sumDigit(2));

    }

    private static int sumDigit (int number) {

        if (number < 10) {
            return -1;
        }
        int totalSum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            totalSum = totalSum + lastDigit;
            number = number / 10;
        }
        return totalSum;

    }
}
