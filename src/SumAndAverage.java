import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {

    }

    public static void inputThenPrintSumAndAverage() {

        int sum = 0;
        int counter = 0;
        Scanner pulache = new Scanner(System.in);
        while (pulache.hasNextInt()) {
            System.out.println("Enter number");
                sum += pulache.nextInt();
                counter++;
        }
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/counter));

    }






}
