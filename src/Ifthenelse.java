public class Ifthenelse {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 1000;
        int scoreDoi = 10000;
        int levelCompletedDoi = 8;
        int bonusDoi = 200;

        int Highscore = calculateScore(true, 800, 5, 100);
        System.out.println(" Your final score was " + Highscore);

        calculateScore(true, 10000, 8, 200);




        if (score == 5000) {
            System.out.println("Your score was 5000");
            System.out.println("This was executed");
        }

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }


        int danzoLovele = 1921;
        if (danzoLovele == 2000) {
            System.out.println("Da-ti-mi oricat!");
        } else if (danzoLovele > 2000) {
            System.out.println("Eheee, lovelee!");
        } else {
            System.out.println("Scuipa-ma-n cap! Fac orice!");
        }

        boolean esteBunoaca = true;
        if (esteBunoaca == true) {
            System.out.println("Ce i-as sparge bucile!");
        }

        if (score == 5000) {
            System.out.println("Your score was 5000");
            System.out.println("This was executed");

        }


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Teo", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Radu", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Vasile", highScorePosition);
        highScorePosition = calculateHighScorePosition(40);
        displayHighScorePosition("Andrei", highScorePosition);

    }




    public static void  displayHighScorePosition (String playerName, int positionPlayer) {
        System.out.println(playerName + " managed to get into position " + positionPlayer + " on the high score table");



    }

    public static int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000)
        {
            return 1;

        } 
        else if (playerScore >= 500) {
            return 2;
        }
        else if (playerScore > 100) {
            return 3;
        }
        else {
            return 4;
        }

    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus); // pot crea in cadrul unui if o variabila dar ramane accesibila doar in block
            System.out.println("Your final score was " + finalScore);
            // int finalScoreDoi = scoreDoi + (levelCompletedDoi * bonusDoi); // pot crea in cadrul unui if o variabila dar ramane accesibila doar in block
            // System.out.println("Your final score doi was " + finalScoreDoi);
            return finalScore;
        }

        return -1;
    }




}
















