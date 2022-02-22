public class SpeedConverter {

    public static void main(String[] args) {
        double milesPerHour = toMilesPerHour(100);
        System.out.println(milesPerHour);
    }


    public static long toMilesPerHour (double kilometersPerHOur) {
        if (kilometersPerHOur < 0) {

            System.out.println("Invalid value");

        } else if (kilometersPerHOur > 0) {

            return  Math.round(kilometersPerHOur / 1.609);
        }
        return -1;


    }
    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " = " + toMilesPerHour(kilometersPerHour));

        }

    }




}
