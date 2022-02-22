public class DecimalComparator {

    public static void main(String[] args) {

    }
    public static boolean areEqualByThreeDecimalPlaces(double Par1, double Par2) {
        long Par1Long = (long) (Par1 * 1000);
        long Par2Long = (long) (Par2 * 1000);
        return Par1Long == Par2Long;



    }
}
