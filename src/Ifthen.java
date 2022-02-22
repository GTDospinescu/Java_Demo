public class Ifthen {

    public static void main(String[] args){

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of alien");
        }
        int topScore = 100;
        if (topScore == 100) {  // != inseamna ca nu e egal, >=, <=
            System.out.println("You got the high score!");
        }

        int secondScore = 60;
        if (topScore > secondScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondScore <= 90)) {
            System.out.println("Either or both of the conditions are ture");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }


        if (isCar) {
            System.out.println("This is not supposed to happen");
        }


        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
        if (isEighteenOrOver == true) {
            System.out.println("isEighteenOrOver hell yes!");
        }

        double firstVar = 20.00d;
        double secVar = 80.00d;
        double varSum = (firstVar + secVar) * 100.00d;
        double sumRem = varSum % 40.00d;
        boolean mayRem = (sumRem == 0) ? true : false;
        System.out.println(mayRem);
        if (mayRem == false) {
            System.out.println("Got some remainder");
        }





    }

}
