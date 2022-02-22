public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(238));

    }

    public static int getEvenDigitSum (int number) {
        if (number < 0){
            return -1;
        }
        int digitNum = 0;
        int Sum = 0;


        while (number > 0){

            digitNum = number % 10;
            if (digitNum % 2 == 0){
                Sum = Sum + digitNum;
            }
            number = number / 10;

        }


        return Sum;
    }

}
