public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(7));

    }

    public static boolean isPerfectNumber (int number){
        if (number < 1){
            return false;
        }
        int factor = 1;
        int itFactor = 1;
        int Sum = 0;
        while (itFactor < number){
            if (number % itFactor == 0){
                factor = itFactor;
                Sum = Sum + factor;
            }
            itFactor++;
        }
        if (Sum == number){
            return  true;
        }return false;
    }

}
