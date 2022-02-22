public class GreatestCommonDivisor {

    public static void main(String[] args) {

    }

    public static int getGreatestCommonDivisor(int first, int second) {


        int commonDiv = 1;
        boolean divChecker1;
        boolean divChecker2;
        int itDiv = 1;
        if (first < 10 || second < 10) {
            return -1;
        }
        while (true) {
            divChecker1 = first % itDiv == 0;
            divChecker2 = second % itDiv == 0;
            if (divChecker1 && divChecker2) {
                commonDiv = itDiv;
            } else if (itDiv >= first || itDiv >= second) {
                return commonDiv;
            }
            itDiv++;


        }
    }
}
