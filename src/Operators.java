public class Operators {

    public static void main(String[] args){

        int result = 1 + 2;
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);
        // result-- (minus 1)
        // result = result + 2 / result += 2
        // result = result * 10 / result *= 10
        // result = result / 2 / result /= 2

    }
}
