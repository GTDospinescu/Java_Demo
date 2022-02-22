public class ForStatment {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
        System.out.println("10,000 at 6% interest = " + calculateInterest(10000.0, 6.0));

        for(int i=0; i<5; i++) {
            System.out.println("Loop" + i + " hello!");
        }
        for (int i=2; i<9; i++) {
            System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, i));
        }
        for (int i=8; i>=2; i--) {
            System.out.println("10,000 at " + i + " interest = " + calculateInterest(10000.0, i));
        }

        int numCount = 0;
        int sum = 0;
        for (int i=1; i<=1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum = sum + i;
                if (++numCount == 5) {
                    break;
                }

            }
        }

        System.out.println(sum);

        System.out.println("PRIME COUNT");
        int primeCount = 0;
        for (int i=245; i<999; i++){
            if(isPrime(i)) {
                System.out.println(i);
                if (++primeCount == 3){
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;

        }
        for (int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
