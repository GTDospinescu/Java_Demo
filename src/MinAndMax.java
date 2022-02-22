import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {
        Scanner pulache = new Scanner(System.in);
        int lastValue = 0;
        int firstValue = 0;
        boolean firstTime = true;
        while (true) {
            System.out.println("Enter number");
            boolean inputIsInt = pulache.hasNextInt();
            if (inputIsInt) {
                if(firstTime){
                    firstValue = pulache.nextInt();
                    lastValue = firstValue;
                    firstTime = false;
                } else {
                    lastValue = pulache.nextInt();
                }

                pulache.nextLine();
            } else {
                System.out.println(firstValue + " " + lastValue);
                break;
//            }scanner.nextLine();
            }


        }

    }
}