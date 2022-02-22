public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameDigit(121,131,157));

    }

    public static boolean hasSameDigit (int num1,int num2, int num3) {
        int digitNum1 = 0;
        int digitNum2 = 0;
        int digitNum3 = 0;
        if ((num1 >= 10 && num1 <= 1000) && (num2 >= 10 && num2 <= 1000) && (num3 >= 10 && num3 <= 1000)) {
            digitNum1 = num1 % 10;
            digitNum2 = num2 % 10;
            digitNum3 = num3 % 10;
        } else return false;
        if (digitNum1 == digitNum2 || digitNum1 == digitNum3 || digitNum2 == digitNum3){
            return true;
        } return false;

    }

    public static boolean isValid (int number){
        return number >= 10 && number <= 1000;
    }

}