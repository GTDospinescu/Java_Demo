public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,99));

    }
    public static boolean hasSharedDigit (int num1, int num2){
        int digitNum1 = 0;
        int digitNum2 = 0;
        if ((num1 >= 10 && num1 <=99) && (num2 >= 10 && num2 <=99)){
            while (num1 > 0) {
                digitNum1 = num1 % 10;
                num1 = num1 / 10;
                int num2Temp = num2;
                while (num2Temp > 0) {
                    digitNum2 = num2Temp % 10;
                    num2Temp = num2Temp / 10;
                    if (digitNum1 == digitNum2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
