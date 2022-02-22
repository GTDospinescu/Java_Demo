public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(0);
        System.out.println(reverse(100));

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }else if(number == 0){
            System.out.println("Zero");
            return;
        }
        int digitCount = getDigitCount(number);
        number = reverse(number);
        while (digitCount > 0) {
            int lastDigit = 0;
            if(number != 0){
                lastDigit = number % 10;
            }

            switch (lastDigit) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;
            }
            number = number / 10;
            digitCount--;
        }


    }


    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }
        return reversed;

    }

    public static int getDigitCount (int number){
        int digitCount = 0;
        if (number < 0){
            return -1;
        } else if(number == 0){
            return 1;
        }
        while (number > 0){
            digitCount++;
            number = number / 10;
        }
        return digitCount;
    }

}
