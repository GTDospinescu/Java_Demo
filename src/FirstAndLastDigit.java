public class FirstAndLastDigit {
    public static void main(String[] args) {

    }
    public static int sumFirstAndLastDigit (int number){
        if(number < 0){
            return  -1;
        }

        int firstDigit = 0;
        int Sum = 0;

        int lastDigit = number % 10;
        Sum = Sum + lastDigit;
        while (number >= 10) {
            number = number / 10;
        }
        firstDigit = number;
        Sum += firstDigit;

        return Sum;

    }

}

