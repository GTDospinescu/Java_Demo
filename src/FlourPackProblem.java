public class FlourPackProblem {

    public static void main(String[] args) {
        System.out.println(canPack(5,3,24));

    }

    public static boolean canPack (int bigCount, int smallCount, int goal){
        if (goal < 0 && bigCount < 0 && smallCount < 0){
            return false;
        }
        int bigCountTotal = bigCount * 5;
        int sum = bigCountTotal + smallCount;
        boolean goalCheckBig;
        boolean sumGoalCheck = sum / goal >= 1;

        goalCheckBig = goal % (bigCountTotal + 1) >= 0;
        if (goal < 5 && goal > smallCount){
            goalCheckBig = false;
        }
        boolean goalCheckSmall = goal % (smallCount + 1) >= 0;
        boolean sumKgBoo = (bigCountTotal + smallCount) % goal >= 0;

        if (goalCheckBig && goalCheckSmall && sumKgBoo && sumGoalCheck) {
            return true;
        }
        return false;


//        if (goal < 0){
//            return false;
//        }
//        int current = 0;
//        while (bigCount-- > 0 && goal - current >= 5){
//            current += 5;
//        }
//        return goal - current <= smallCount;




    }
}


