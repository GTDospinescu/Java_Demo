import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int counter = 1;

        while (counter <= 10) {
            String itNum = String.valueOf(counter);
            System.out.println("Enter number #" + itNum + ": ");

            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
//                    counter += 1;
//                    scanner.nextLine();
                sum += number;
            } else {
                System.out.println("Invalid Number");
            }
            counter += 1;
            scanner.nextLine();

        }



        scanner.close();
        System.out.println(sum);


    }
}
