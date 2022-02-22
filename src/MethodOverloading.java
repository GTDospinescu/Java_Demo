public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim" , 500);
        System.out.println(" New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(getDurationString(80,56));
        System.out.println(getDurationString(999));

    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;

    }
    public static int calculateScore (int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;

    }
    public static int calculateScore () {
        System.out.println("No player name, no score");
        return 0;

    }
    public static double calcFeetAndInchesToCentimeters (int feet, int inches) {
        if(feet >= 0 && inches >= 0 && inches <= 12){

            return inches * 2.54 + (feet * 12) * 2.54;
        }
        return -1;

    }
    public static double calcFeetAndInchesToCentimeters (int inches) {
        if (inches >= 0) {
            int feet = inches / 12;
            int reminches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, reminches);
        }
        return -1;

    }

    public static String getDurationString (int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59){
            int hours = minutes / 60;
            int remMinutes = minutes % 60;
            return hours + "h " + remMinutes + "m " + seconds + "s";

        }
            return "Invalid value";
    }

    public static String getDurationString (int seconds) {
        if(seconds >= 0) {
            int minutes = seconds / 60;
            int remSec = seconds % 60;
            return getDurationString(minutes, remSec);
        }
        return "Invalid value";
    }



}
