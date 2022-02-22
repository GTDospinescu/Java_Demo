public class LeapYear {

    public static void main(String[] args) {

    }

    public static boolean isLeapYear (int year) {

        if (year < 1 || year >= 10000) {
            return false;

        } else if (year % 4 != 0){
            return false;
        }
        else if (year % 100 != 0) {
            return true;
        }
        else if (year % 400 == 0) {
            return true;
        }

         else {
            return false;
        }

    }
}
