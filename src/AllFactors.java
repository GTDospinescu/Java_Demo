public class AllFactors {
    public static void main(String[] args) {
        printFactors(34);

    }

    public static void printFactors(int number){
        int factor = 1;
        if (number < 1){
            System.out.println("Invalid Value");
        }
        while (factor <= number){
            if (number % factor == 0){
                System.out.println(factor);
            }
            factor++;
        }

    }

}
