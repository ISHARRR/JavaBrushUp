package speed.converter.basic;

public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(10.5);

    }

    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour<0) {
            return -1;
        } else {
            long milesPerHour = Math.round(kilometersPerHour/1.609);
            return milesPerHour;
        }
    }

    public static void printConversion (double kilometersPerHour) {
        long kilo = Math.round(kilometersPerHour);
        long miles = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour<0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilo + " km/h = " + miles + " mi/h");
        }
    }
 
}
