public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));

    }

    public static int getLargestPrime (int number){
        if (number < 2){
            return -1;
        }
        int primeDivisor = -1;
        int itDiv = 1;

        while (number >= itDiv){
            int itDiv2 = 2;
            boolean isPrime = true;
            while (itDiv > itDiv2){
                int rez = itDiv % itDiv2;
                if (rez == 0){
                    isPrime = false;
                    break;
                }
                itDiv2++;
            }
            if (number % itDiv == 0 && isPrime){
                primeDivisor = itDiv;
            }
            itDiv++;
        }
        return primeDivisor;



    }

    public static boolean isPrime (int number){
        if (number < 2){
            return false;
        }
        int itDiv2 = 2;
        while (number > itDiv2){
            int rez = number % itDiv2;
            if (rez == 0){
                return false;
            }
            itDiv2++;
        }
        return true;

    }


}
